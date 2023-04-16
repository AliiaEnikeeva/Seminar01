package Homework01;

public class Dummy extends Children{
    public Dummy(String name, String price, Integer quantity, String unit, Integer min_age, Boolean hipoallergenicity) {
        super(name, price, quantity, unit, min_age, hipoallergenicity);
    }

    @Override
    public String toString() {
        return "Dummy " + "{" +
                "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                '}';
    }
}
