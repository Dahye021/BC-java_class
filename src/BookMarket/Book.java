package BookMarket;

public class Book extends Item {
    public Book(String[] bookInfo) {
        this.id = bookInfo[0];
        this.title = bookInfo[1];
        this.price = bookInfo[2];
        this.author = bookInfo[3];
        this.description = bookInfo[4];
        this.category = bookInfo[5];
        this.date = bookInfo[6];
    }

    public String[] toArray() {
        return new String[] {id, title, price, author, description, category, date};
    }
}
