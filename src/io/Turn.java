import java.util.ArrayList;
import java.util.List;

public class Turn {
    TurnState turnState;
    ConsoleReader reader;
    ConsoleWriter writer;
    GridBuilder builder;
    GridDirector gridDirector;
    List<List<String>> grid;
    checkGridFacade checkGridFacade;
    public Turn(TurnState turnState, ConsoleReader reader, ConsoleWriter writer) {
        this.turnState = turnState;
        this.reader = reader;
        this.writer = writer;
        this.builder = new GridBuilder();
        this.gridDirector = new GridDirector();
        this.grid = new ArrayList<>();
        this.checkGridFacade = new checkGridFacade();
        grid.add(List.of(" ", " ", " "));
        grid.add(List.of(" ", " ", " "));
        grid.add(List.of(" ", " ", " "));
    }

    public void changeState(TurnState state) {
        this.turnState = state;
    }

    public void startTurn() {
        this.turnState.startTurn(this.writer);
    }

    public void askQuestion(Question question) {
        question.writeQuestion(this.writer);
    }

    public boolean checkAnswer(Question question) {
        if(question.checkAnswer(reader)) {
            this.writer.clearConsole();
            writer.writeLine("correct");
            writer.writeLine("");
            return true;
        } else {
            this.writer.clearConsole();
            writer.writeLine("wrong");
            writer.writeLine("");
            return false;
        }
    };
    public void renderBoard() {
        this.gridDirector.createGrid(this.builder, this.grid);
        this.writer.writeLine(this.builder.returnGrid());
    };
    public void placeSymbol() {
        this.grid = this.turnState.placeSymbol(this.reader, this.writer, this.grid);
    };

    public boolean checkGrid() {
        return this.turnState.checkGrid(this.grid, this.checkGridFacade);
    }

    public boolean checkTie() {
        int count = 0;
        for (int i = 0; i < this.grid.size(); i++) {
            for (int j = 0; j < this.grid.size(); j++) {
                if (this.grid.get(i).get(j) != " ") {
                    count++;
                }
            }
        }
        if (count == 9) {
            writer.writeLine("The game is tied, nobody has won.");
            return true;
        }   return false;
    }

    public void endTurn() {
        this.turnState.endTurn();
    }
    public void endGame() {
        this.turnState.endGame(this.writer);
    }
}
