import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        Boolean validPlacement = false;

        while (!validPlacement) {
            writer.writeLine("Write the number of the empty square you want to place your symbol in");
            String selected = reader.readLine();
            Integer xPosition = Integer.parseInt(selected) % 3;
            if (xPosition == 0) {
                xPosition = 3;
            }
            Integer yPosition = (int) Math.ceil(Double.parseDouble(selected) / 3);

            List<String> rowToModify = new ArrayList<>(grid.get(yPosition - 1));

            if (Objects.equals(rowToModify.get(xPosition - 1), " ")) {
                rowToModify.set(xPosition - 1, this.symbol);
                grid.set(yPosition - 1, rowToModify);
                validPlacement = true;
            } else {
                writer.writeLine("That spot has already been taken, choose another please");
                validPlacement = false;
            }

        }
        return grid;
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
