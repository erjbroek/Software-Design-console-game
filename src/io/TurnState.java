import java.util.List;

public interface TurnState {

    void startTurn(ConsoleWriter writer);

    List<List<String>> placeSymbol(ConsoleReader reader, ConsoleWriter writer, List<List<String>> grid);

    boolean checkGrid(List<List<String>> grid, checkGridFacade checkGridFacade);

    void endTurn();
    void endGame(ConsoleWriter writer);
}
