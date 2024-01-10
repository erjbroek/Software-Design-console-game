public class OpenQuestion implements Question {
    public String question;

    public String answer;

    public OpenQuestion(String question, String answer ) {
        this.question = question;
        this.answer = answer;
    }

    public void writeQuestion(ConsoleWriter writer) {
        writer.writeLine(question + "?");
    }

    public boolean checkAnswer(ConsoleReader reader) {
        String selected = reader.readLine().toLowerCase();

        if (answer.toLowerCase().equalsIgnoreCase(selected)) {
            return true;
        } return false;
    }
}
