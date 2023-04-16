package Homework01;

public class Bread extends Food{

    private String typeFlour;

    public Bread(String name, String price, Integer quantity, String unit, int exDate, String typeFlour) {
        super(name, price, quantity, unit, exDate);
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return "Bread {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", тип муки ='" + typeFlour + '\'' +
                ", срок годности =" + exDate +
                "} ";
    }
}
