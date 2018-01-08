public class Book {

    private String title;
    private Authors[] authors;
    private double price;
    private int qty;

    public Book(String title, Authors[] authors, double price, int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public Authors[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }




    @Override
    public String toString() {
        return "Title: " + getTitle() +", author: [" + getAuthors() + "], price: " + getPrice() + ", quantity: " + getQty();
    }
}
