import java.util.List;

public class TurnStartGame implements TurnState {
    Turn context;
    public TurnStartGame(Turn context) {
        this.context = context;
    }

    @Override
    public void startTurn(ConsoleWriter writer) {
        writer.writeLine("Player 1 turn");
        this.context.changeState(new TurnPlayer1(context));
    }

    @Override
    public List<List<String>> placeSymbol(ConsoleReader reader, ConsoleWriter writer, List<List<String>> grid) {
        return null;
    }


    @Override
    public void endTurn() {
        System.out.println("Player 2 turn");
        this.context.changeState(new TurnPlayer2(context));
    }

    @Override
    public void endGame() {
        throw new UnsupportedOperationException("You cannot end the game if nobody has taken a turn");
    }
}
