import java.util.List;

public class GridDirector {
    public void createGrid(gridBuilderInterface builder, List<List<String>> array) {
        builder.firstRow();
        builder.indexRow("1", "2", "3");
        builder.optionRow(array.get(0));
        builder.bottomRow();
        builder.indexRow("4", "5", "6");
        builder.optionRow(array.get(1));
        builder.bottomRow();
        builder.indexRow("7", "8", "9");
        builder.optionRow(array.get(2));
        builder.bottomRow();
    };
}
