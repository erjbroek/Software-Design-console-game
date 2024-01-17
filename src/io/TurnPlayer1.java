import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        boolean validPlacement = false;

        while (!validPlacement) {
            writer.writeLine("Write the number of the empty square you want to place your symbol in");
            String selected = reader.readLine();
            if (selected.matches("\\d+")) {
                if (Integer.parseInt(selected) >= 1 && Integer.parseInt(selected) <= 9) {
                    int xPosition = Integer.parseInt(selected) % 3;
                    if (xPosition == 0) {
                        xPosition = 3;
                    }
                    int yPosition = (int) Math.ceil(Double.parseDouble(selected) / 3);

                    List<String> rowToModify = new ArrayList<>(grid.get(yPosition - 1));

                    if (Objects.equals(rowToModify.get(xPosition - 1), " ")) {
                        rowToModify.set(xPosition - 1, this.symbol);
                        grid.set(yPosition - 1, rowToModify);
                        validPlacement = true;
                    } else {
                        writer.writeLine("That spot has already been taken, choose another please");
                    }
                } else {
                    writer.writeLine("Number out of bounds, select value 1 - 9");
                }
            } else {
                writer.writeLine("Input is not a number, select value 1 - 9");
            }

        }
        return grid;
    }

    @Override
    public boolean checkGrid(List<List<String>> grid, checkGridFacade checkGridFacade) {
        return checkGridFacade.check(grid, this.symbol);
    }

    @Override
    public void endTurn() {
        this.context.changeState(new TurnPlayer2(context));
    }

    @Override
    public void endGame(ConsoleWriter writer) {
        writer.writeLine("player " + this.symbol + " has won!");
    }
}
