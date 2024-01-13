public class TurnStartGame implements TurnState {
    Turn context;
    public TurnStartGame(Turn context) {
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
        System.out.println("Player 2 turn");
        this.context.changeState(new TurnPlayer2(context));
    }

    @Override
    public void endGame() {
        throw new UnsupportedOperationException("You cannot end the game if nobody has taken a turn");
    }
}
