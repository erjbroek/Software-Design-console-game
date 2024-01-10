public class Main {
    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        MultChoice question1 = new MultChoice("Wat is een aap", new String[]{"een aap", "een koe", "een kip"}, "een aap");
        question1.writeQuestion(writer);
        if(question1.checkAnswer(reader)) {
            writer.writeLine("correct");
        } else {
            writer.writeLine("nu uh");
        }

        TrueFalse question2 = new TrueFalse("Zijn apen echte dieren", "False");
        question2.writeQuestion(writer);
        if(question2.checkAnswer(reader)) {
            writer.writeLine("correct");
        } else {
            writer.writeLine("nu uh");
        }

        OpenQuestion question3 = new OpenQuestion("hoe heet de aap", "jan");
        question3.writeQuestion(writer);
        if(question3.checkAnswer(reader)) {
            writer.writeLine("correct");
        } else {
            writer.writeLine("nu uh");
        }
    }
}