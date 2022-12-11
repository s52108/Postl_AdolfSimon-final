package products;

public class Product {

    private String name;
    private double price;
    private int categoryID;
    private String colour;

    public Product(String name, double price, int categoryID, String colour) {
        this.name = name;
        this.price = price;
        this.categoryID = categoryID;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryID=" + categoryID +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}