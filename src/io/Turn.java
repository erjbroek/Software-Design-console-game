public class Turn {
    TurnState turnState;
    public Turn(TurnState turnState) {
        this.turnState = turnState;
    }

    public void changeState(TurnState state) {
        this.turnState = state;
    }

    public void turnStartGame(){
        this.turnState.startGame();
    }
    public void turnPlayer1() {
        this.turnState.turnPlayer1();
    }
    public void turnPlayer2() {
        this.turnState.turnPlayer2();
    }
    public void turnEndGame() {
        this.turnState.endGame();
    }
}
