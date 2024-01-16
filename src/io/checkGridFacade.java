import java.util.List;

public class checkGridFacade {

    HorizontalCheck horizontalCheck;
    VerticalCheck verticalCheck;
    DiagonalCheck diagonalCheck;

    public checkGridFacade() {
        this.horizontalCheck = new HorizontalCheck();
        this.verticalCheck = new VerticalCheck();
        this.diagonalCheck = new DiagonalCheck();
    }

    public boolean check(List<List<String>> grid, String symbol) {
        if (this.horizontalCheck.checkGrid(grid, symbol) || this.verticalCheck.checkGrid(grid, symbol) || this.diagonalCheck.checkGrid(grid, symbol)) {
            return true;
        } return false;
    }
}
