package BookMarket;

public abstract class Item {
    protected String id;
    protected String title;
    protected String price;
    protected String author;
    protected String description;
    protected String category;
    protected String date;

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getPrice() { return price; }
    public String getAuthor() { return author; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getDate() { return date; }
}
