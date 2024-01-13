public class TurnPlayer2 implements TurnState {
    Turn context;
    public TurnPlayer2(Turn context) {
        this.context = context;
    }
    @Override
    public void startGame() {
        throw new UnsupportedOperationException("You cannot start a game when the game has already started");
    }

    @Override
    public void turnPlayer1() {
        System.out.println("Player 1 turn");
        this.context.changeState(new TurnPlayer1(context));
    }

    @Override
    public void turnPlayer2() {
        throw new UnsupportedOperationException("You cannot have a turn again you have already had your turn");
    }

    @Override
    public void endGame() {
        this.context.changeState(new TurnEndGame(context));
    }
}
