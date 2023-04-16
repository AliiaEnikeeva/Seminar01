package Homework01;

public class Food extends Product{
     public int exDate;

    public Food(String name, String price, Integer quantity, String unit, int exDate) {
        super(name, price, quantity, unit);
        this.exDate = exDate;
    }

    @Override
    public String toString() {
        return "Food {" +
                "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", срок годности =" + exDate +
                '}';
    }
}

