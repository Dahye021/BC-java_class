package BookMarket;

public class Book extends Item {
    private String author, desc, category, pubDate;

    public Book(String bookID, String title, int price, String author, String desc, String category, String pubDate) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.author = author;
        this.desc = desc;
        this.category = category;
        this.pubDate = pubDate;
    }

    @Override
    public String getBookID() { return bookID; }
    @Override
    public String getTitle() { return title; }
    @Override
    public int getPrice() { return price; }

    public String getAuthor() { return author; }
    public String getDesc() { return desc; }
    public String getCategory() { return category; }
    public String getPubDate() { return pubDate; }
}