public class Main {
    public static void main(String[] args) {
        // var tv1 = new TV();
        // var tv2 = tv1;
        // tv2.volumeUp();
        // System.out.println(tv1.hashCode());
        // System.out.println(tv2.hashCode());
        // System.out.println(tv1.volumeUp());

        Book book1 = new Book();
        var book = new Book("Some", "bb", 15.5);
        System.out.println(book.toString());
    }
}
