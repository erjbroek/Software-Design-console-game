import java.util.List;

public class DiagonalCheck implements checkGrid {
    public boolean checkGrid(List<List<String>> grid, String symbol) {
        if (grid.get(0).get(0) == symbol && grid.get(1).get(1) == symbol && grid.get(2).get(2) == symbol) {
            return true;
        } else if (grid.get(0).get(2) == symbol && grid.get(1).get(1) == symbol && grid.get(2).get(0) == symbol) {
            return true;
        } return false;
    }
}
