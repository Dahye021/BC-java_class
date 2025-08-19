package 과제;

import java.time.LocalDate;

public class Board {
    private int no;
    private String title;
    private String content;
    private String writer;
    private LocalDate date;

    public Board(int no, String title, String content, String writer, LocalDate date) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public LocalDate getDate() {
        return date;
    }
}
