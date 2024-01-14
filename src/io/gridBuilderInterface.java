import java.util.List;

public interface gridBuilderInterface {

    public void firstRow();
    public void indexRow(String index1, String index2, String index3);
    public void optionRow(List<String> myStringList);
    public void bottomRow();
    public void reset();
    public String returnGrid();

    public String addNewLine();
}
