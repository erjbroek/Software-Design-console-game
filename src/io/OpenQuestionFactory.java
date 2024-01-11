public class OpenQuestionFactory extends QuestionFactory {
    @Override
    Question createQuestion(String question, String answer, String[] options) {
        return new OpenQuestion(question, answer);
    }
}
