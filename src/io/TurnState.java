import java.util.List;

public interface TurnState {

    void startTurn(ConsoleWriter writer);

    List<List<String>> placeSymbol(ConsoleReader reader, ConsoleWriter writer, List<List<String>> grid);

    void endTurn();
    void endGame();
}
