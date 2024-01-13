import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Turn turn = new Turn(new TurnNullState());
        TurnStartGame startState = new TurnStartGame(turn);
        turn.changeState(startState);


        MultChoiceFactory multChoiceFactory = new MultChoiceFactory();
        OpenQuestionFactory openQuestionFactory = new OpenQuestionFactory();
        TrueFalseFactory trueFalseFactory = new TrueFalseFactory();

        Question question1 = multChoiceFactory.createQuestion("Wat is een aap", "een aap", new String[]{"een aap", "een koe", "een kip"});
        Question question2 = openQuestionFactory.createQuestion("hoe heet de aap", "jan", null);
        Question question3 = trueFalseFactory.createQuestion("Zijn apen echte dieren", "False", null);
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();


        List<List<String>> grid = new ArrayList<>();

        grid.add(List.of(" ", " ", " "));
        grid.add(List.of(" ", " ", " "));
        grid.add(List.of(" ", " ", " "));

        GridBuilder builder = new GridBuilder();
        GridDirector gridDirector = new GridDirector();
        gridDirector.createGrid(builder, grid);

        writer.writeLine(builder.returnGrid());

//
//        question1.writeQuestion(writer);
//        if(question1.checkAnswer(reader)) {
//            writer.writeLine("correct");
//        } else {
//            writer.writeLine("nu uh");
//        }
//
//        question2.writeQuestion(writer);
//        if(question2.checkAnswer(reader)) {
//            writer.writeLine("correct");
//        } else {
//            writer.writeLine("nu uh");
//        }
//
//        question3.writeQuestion(writer);
//        if(question3.checkAnswer(reader)) {
//            writer.writeLine("correct");
//        } else {
//            writer.writeLine("nu uh");
//        }
    }
}