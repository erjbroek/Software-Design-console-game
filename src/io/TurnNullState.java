import java.util.List;

public class TurnNullState implements TurnState {
    @Override
    public void startTurn(ConsoleWriter writer) {

    }

    @Override
    public List<List<String>> placeSymbol(ConsoleReader reader, ConsoleWriter writer, List<List<String>> grid) {
        return null;
    }

    @Override
    public void endTurn() {

    }

    @Override
    public void endGame() {

    }
}
