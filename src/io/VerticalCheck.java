import java.util.List;

public class VerticalCheck implements checkGrid {
    public boolean checkGrid(List<List<String>> grid, String symbol) {
        for (int i = 0; i < grid.size(); i++) {
            if (grid.get(0).get(i) == symbol && grid.get(1).get(i) == symbol &&grid.get(2).get(i) == symbol) {
                return true;
            }
        } return false;
    }
}
