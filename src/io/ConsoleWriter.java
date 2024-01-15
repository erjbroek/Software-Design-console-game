import java.io.IOException;

public class ConsoleWriter {

    public void writeLine(String line) {
        System.out.println(line);
    }

    public void clearConsole() {
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }
}