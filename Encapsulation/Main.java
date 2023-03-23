public class Main {
    public static void main(String[] args) {
        var book = new Book();
        // book.title = "History";

        book.setPrice(-10);
        book.setDiscount(0.2);

        System.out.println(book.calculateSellingPrice());
    }
}
