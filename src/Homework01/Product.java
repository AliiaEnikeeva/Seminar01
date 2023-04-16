package Homework01;

public class Product {
    public String name;
    public String price;
    public Integer quantity;
    public String unit;

    public Product(String name, String price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "{" +
                "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                '}';
    }
}
