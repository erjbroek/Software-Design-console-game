import java.util.List;

public class GridBuilder implements gridBuilderInterface{

    private String gameboard = "";

    private ConsoleWriter writer;

    public void firstRow() {
        gameboard += "___________________";
        gameboard += addNewLine();
    }
    public void indexRow(String index1, String index2, String index3) {
        gameboard += "|" + index1 + "    |" + index2 + "    |" + index3 + "    |";
        gameboard += addNewLine();
    }
    public void optionRow(List<String> myStringList) {
        gameboard += "|  " + myStringList.get(0) + "  |  " + myStringList.get(1) + "  |  " + myStringList.get(2) + "  |";
        gameboard += addNewLine();
    }
    public void bottomRow() {
        gameboard += "|_____|_____|_____|";
        gameboard += addNewLine();
    }
    public String returnGrid() {
        return gameboard;
    }

    public String addNewLine() {
        return "\n\r";
    }
}
