public class MultChoiceFactory extends QuestionFactory {
    @Override
    Question createQuestion(String question, String answer, String[] options) {
        return new MultChoice(question, options, answer);
    }
}
