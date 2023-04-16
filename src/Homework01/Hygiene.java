package Homework01;

public class Hygiene extends Product{
    public Integer amount;

    public Hygiene(String name, String price, Integer quantity, String unit, Integer amount) {
        super(name, price, quantity, unit);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Hygiene {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", количество в упаковке =" + amount +
                "} ";
    }
}
