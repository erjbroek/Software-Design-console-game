import java.util.ArrayList;
import java.util.List;

public class Turn {
    TurnState turnState;
    ConsoleReader reader;
    ConsoleWriter writer;
    GridBuilder builder;
    GridDirector gridDirector;
    List<List<String>> grid;
    public Turn(TurnState turnState) {
        this.turnState = turnState;
        this.reader = new ConsoleReader();
        this.writer = new ConsoleWriter();
        this.builder = new GridBuilder();
        this.gridDirector = new GridDirector();
        this.grid = new ArrayList<>();
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
            writer.writeLine("correct");
            return true;
        } else {
            writer.writeLine("nu uh");
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

    public void endTurn() {
        this.turnState.endTurn();
    }
    public void endGame() {
        this.turnState.endGame();
    }
}
