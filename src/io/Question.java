import java.util.ArrayList;
import java.util.List;

public interface Question {

    public void writeQuestion(ConsoleWriter writer);
    public boolean checkAnswer(ConsoleReader reader);
}
