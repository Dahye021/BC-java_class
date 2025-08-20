package Study.Collection1;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList () {
        List<Board> Boards = new ArrayList<Board>();
        Board Board1 = new Board("제목1", "내용1");
        Board Board2 = new Board("제목2", "내용2");
        Board Board3 = new Board("제목3", "내용3");
        Boards.add(Board1);
        Boards.add(Board2);
        Boards.add(Board3);
        return Boards;
    }
}
