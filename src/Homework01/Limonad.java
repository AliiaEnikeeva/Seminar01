package Homework01;

public class Limonad extends Drink{
    public Limonad(String name, String price, Integer quantity, String unit, Integer volume) {
        super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        return "Limonad " + "{" +
                "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество=" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                '}';
    }
}
