public class Ebook extends Book {
    private String format;

    public Ebook() {

    }

    public Ebook(String title, String author, double price, String format) {
        super(title, author, price);
        this.format = format;
    }

}

// = Single
// = Multilevel
// = Hierachical inheritance
// = Hybrid inheritance