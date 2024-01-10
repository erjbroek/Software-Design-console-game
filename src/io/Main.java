public class Main {
    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        MultChoice multChoice = new MultChoice("Wat is een aap", new String[]{"een aap", "een koe", "een kip"}, "een aap");
        multChoice.writeQuestion(writer);
        if(multChoice.checkAnswer(reader)) {
            writer.writeLine("correct");
        } else {
            writer.writeLine("nu uh");
        }
    }
}