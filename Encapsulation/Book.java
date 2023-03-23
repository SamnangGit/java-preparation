// bunndle data and method that operate on them together
// data validation

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        System.out.println("invalid price");
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private String title = "";
    private double price;
    private double discount;

    public double calculateSellingPrice() {
        return price - (price * discount);
    }

}
