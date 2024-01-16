import java.util.List;

public class HorizontalCheck implements checkGrid {
    public boolean checkGrid(List<List<String>> grid, String symbol) {
        for (int i = 0; i < grid.size(); i++) {
            if (grid.get(i).get(0) == symbol && grid.get(i).get(1) == symbol &&grid.get(i).get(2) == symbol) {
                return true;
            }
        } return false;
    }
}
