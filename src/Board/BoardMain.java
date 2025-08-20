package Board;

public class BoardMain {
    public static void main(String[] args) {
        BoardManger boardManger = new BoardManger();
        BoardExample borads = new BoardExample(boardManger);
        borads.run();

    }
}
