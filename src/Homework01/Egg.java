package Homework01;

public class Egg extends Food{
    public Integer amount;

    public Egg(String name, String price, Integer quantity, String unit, int exDate, Integer amount) {
        super(name, price, quantity, unit, exDate);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Egg {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", кол-во в упаковке =" + amount +
                ", срок годности =" + exDate +
                "} ";
    }
}
