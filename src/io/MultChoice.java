import java.util.Arrays;
import java.util.Objects;

public class MultChoice implements Question {
    public String question;

    public String[] options;

    public String answer;

    public MultChoice(String question, String[] options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public void writeQuestion(ConsoleWriter writer) {
        writer.writeLine(question);
        writer.writeLine("");


        for (int i = 0; i < options.length; i++) {
            writer.writeLine(i + 1 + ": " + options[i]);
        }
        writer.writeLine("");
        writer.writeLine("Selecteer het goede antwoord:");
    }

    public boolean checkAnswer(ConsoleReader reader) {
        String selected = reader.readLine();

        if (Objects.equals(selected, answer) || Objects.equals(Integer.toString(Arrays.asList(options).indexOf(answer) + 1), selected)) {
            return true;
        }
        return false;
    }
}
