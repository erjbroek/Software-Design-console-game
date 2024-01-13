public class TurnEndGame implements TurnState {
    Turn context;
    public TurnEndGame(Turn context) {
        this.context = context;
    }
    @Override
    public void startGame() {
        System.out.println("Started a new game");
        this.context.changeState(new TurnStartGame(context));
    }

    @Override
    public void turnPlayer1() {
        throw new UnsupportedOperationException("It isn't your turn, the game has already ended");
    }

    @Override
    public void turnPlayer2() {
        throw new UnsupportedOperationException("It isn't your turn, the game has already ended");
    }

    @Override
    public void endGame() {
        throw new UnsupportedOperationException("You cannot end a game that has already ended");
    }
}
