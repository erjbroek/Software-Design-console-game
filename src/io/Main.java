import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Turn turn = new Turn(new TurnNullState(), reader, writer);
        TurnPlayer1 turnPlayer1 = new TurnPlayer1(turn);
        boolean endPlaying = false;
        turn.changeState(turnPlayer1);

        MultChoiceFactory multChoiceFactory = new MultChoiceFactory();
        OpenQuestionFactory openQuestionFactory = new OpenQuestionFactory();
        TrueFalseFactory trueFalseFactory = new TrueFalseFactory();
        List<Question> questions = new ArrayList<>();
        // multiple choice questions
        questions.add(multChoiceFactory.createQuestion("What is the smallest country in the world?", "Vatican City", new String[]{"Luxembourg", "Vatican City", "Liechtenstein"}));
        questions.add(multChoiceFactory.createQuestion("A green owl is the mascot for which app?", "Duolingo", new String[]{"Spotify", "Tinder", "Duolingo", "Twitter",}));
        questions.add(multChoiceFactory.createQuestion("Hippopotomonstrosesquippedaliophobia is a phobia for:", "Long words", new String[]{"Long words", "Big animals", "Small places"}));
        questions.add(multChoiceFactory.createQuestion("What is the most common surname in the United States?", "Smith", new String[]{"Brown", "Smith", "Wilson", "MacDonald", "Williams"}));
        // open questions
        questions.add(openQuestionFactory.createQuestion("In a website browser address bar, what does “www” stand for?", "World Wide Web", null));
        questions.add(openQuestionFactory.createQuestion("What game studio makes the Grand Theft Auto series? ", "Rockstar", null));
        questions.add(openQuestionFactory.createQuestion("What is the fastest animal on planet earth?", "Cheetah", null));
        questions.add(openQuestionFactory.createQuestion("What is the chemical symbol for gold?", "Au", null));

        // true / false questions
        questions.add(trueFalseFactory.createQuestion("Africa is the largest continent.", "False", null));
        questions.add(trueFalseFactory.createQuestion("The blue whale is the biggest animal to have ever lived.", "True", null));
        questions.add(trueFalseFactory.createQuestion("Scotland’s national animal is a unicorn.", "True", null));
        questions.add(trueFalseFactory.createQuestion("The main language of brazil is brazilian.", "False", null));


        while (!endPlaying) {
            // get a random question
            int randomInt = (int) Math.round(Math.random() * (questions.size() - 1));
            Question question = questions.get(randomInt);

            // turn of a player
            turn.startTurn();
            turn.askQuestion(question);
            if (turn.checkAnswer(question)) {
                turn.renderBoard();
                turn.placeSymbol();
                writer.clearConsole();
                turn.renderBoard();
                questions.remove(randomInt);
                if (turn.checkGrid()) {
                    turn.endGame();
                    endPlaying = true;
                } else {
                    turn.endTurn();
                }
            } else {
                turn.endTurn();
            }
        }
    }
}