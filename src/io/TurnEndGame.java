import java.util.List;

public class TurnEndGame implements TurnState {
    Turn context;
    public TurnEndGame(Turn context) {
        this.context = context;
    }

    @Override
    public void startTurn(ConsoleWriter writer) {
        throw new UnsupportedOperationException("It isn't your turn, the game has already ended");
    }

    @Override
    public List<List<String>> placeSymbol(ConsoleReader reader, ConsoleWriter writer, List<List<String>> grid) {
        return null;
    }

    @Override
    public void endTurn() {
        throw new UnsupportedOperationException("It isn't your turn, the game has already ended");
    }

    @Override
    public void endGame() {
        throw new UnsupportedOperationException("You cannot end a game that has already ended");
    }
}
