package model;

public class Horse {
    private String name;
    private double price;

    public Horse(String name, String price) {
        this.name = name;
        this.price = Double.parseDouble(price);
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
}
