import java.util.List;

public class TurnPlayer2 implements TurnState {
    Turn context;
    String symbol;
    public TurnPlayer2(Turn context) {
        this.context = context;
        this.symbol = "O";
    }

    @Override
    public void startTurn(ConsoleWriter writer) {
        writer.writeLine("It is player " + this.symbol + " turn");
    }

    @Override
    public List<List<String>> placeSymbol(ConsoleReader reader, ConsoleWriter writer, List<List<String>> grid) {
        return null;
    }

    @Override
    public void endTurn() {
        System.out.println("Give turn to player 1");
        this.context.changeState(new TurnPlayer1(context));
    }

    @Override
    public void endGame() {
        this.context.changeState(new TurnEndGame(context));
    }
}
