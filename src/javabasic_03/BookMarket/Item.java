package javabasic_03.BookMarket;

public abstract class Item {
    protected String bookID;
    protected String title;
    protected int price;

    public abstract String getBookID();
    public abstract String getTitle();
    public abstract int getPrice();
}