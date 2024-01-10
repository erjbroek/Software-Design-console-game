import java.util.Arrays;
import java.util.Objects;

public class TrueFalse implements Question {

    public String question;

    public String answer;

    public TrueFalse(String question, String answer ) {
        this.question = question;
        this.answer = answer;
    }

    public void writeQuestion(ConsoleWriter writer) {
        writer.writeLine(question);
        writer.writeLine("");
        writer.writeLine("True or False?");
    }

    public boolean checkAnswer(ConsoleReader reader) {
        String selected = reader.readLine().toLowerCase();

        if (answer.equalsIgnoreCase("false")) {
            return selected.equals("no") || selected.equals("incorrect") || selected.equals("false");
        }
        else if (answer.equalsIgnoreCase("true")) {
            return selected.equals("yes") || selected.equals("correct") || selected.equals("true");
        }
        else {
            System.out.println("That is not a valid answer");
            return false;
        }
    }
}
