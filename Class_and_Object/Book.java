import javax.sound.midi.Soundbank;

public class Book {
    String title;
    String author;
    double price;

    // no-arg and parameterized construct

    // no-arg constructor
    public Book() {
    };

    // parameterized construtor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}
