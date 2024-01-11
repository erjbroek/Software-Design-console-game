public class TrueFalseFactory extends QuestionFactory {
    @Override
    Question createQuestion(String question, String answer, String[] options) {
        return new TrueFalse(question, answer);
    }
}
