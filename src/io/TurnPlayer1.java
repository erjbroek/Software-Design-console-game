public class TurnPlayer1 implements TurnState{
    Turn context;
    public TurnPlayer1(Turn context) {
        this.context = context;
    }
    @Override
    public void startGame() {
        throw new UnsupportedOperationException("You cannot start a game when the game has already started");
    }

    @Override
    public void turnPlayer1() {
        throw new UnsupportedOperationException("You cannot have a turn again you have already had your turn");
    }

    @Override
    public void turnPlayer2() {
        System.out.println("Player 2 turn");
        this.context.changeState(new TurnPlayer2(context));
    }

    @Override
    public void endGame() {
        this.context.changeState(new TurnEndGame(context));
    }
}
