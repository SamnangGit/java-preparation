public class Book {

    private String title;
    private String author;
    private double price;
    private double discount;

    public Book() {
        System.out.println("From Parent");
    };

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, double price, double discount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }

    public double calculateSellingPrice() {
        return price - (price * discount);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", selling price=" + calculateSellingPrice() + "]";
    }

}
