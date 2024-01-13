import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Turn turn = new Turn(new TurnNullState());
        TurnPlayer1 turnPlayer1 = new TurnPlayer1(turn);
        turn.changeState(turnPlayer1);

        MultChoiceFactory multChoiceFactory = new MultChoiceFactory();
        OpenQuestionFactory openQuestionFactory = new OpenQuestionFactory();
        TrueFalseFactory trueFalseFactory = new TrueFalseFactory();

        Question question1 = multChoiceFactory.createQuestion("Wat is een aap", "een aap", new String[]{"een aap", "een koe", "een kip"});
        Question question2 = openQuestionFactory.createQuestion("hoe heet de aap", "jan", null);
        Question question3 = trueFalseFactory.createQuestion("Zijn apen echte dieren", "False", null);

        turn.startTurn();
        turn.askQuestion(question1);
        turn.checkAnswer(question1);
        turn.renderBoard();
        //turn.placeSymbol();
        turn.endTurn();
    }
}