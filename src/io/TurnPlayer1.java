import java.util.List;

public class TurnPlayer1 implements TurnState{
    Turn context;
    String symbol;
    public TurnPlayer1(Turn context) {
        this.context = context;
        this.symbol = "X";
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
        System.out.println("Give turn to player 2");
        this.context.changeState(new TurnPlayer2(context));
    }

    @Override
    public void endGame() {
        this.context.changeState(new TurnEndGame(context));
    }
}
