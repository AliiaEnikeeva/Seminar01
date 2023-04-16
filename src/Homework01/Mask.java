package Homework01;

public class Mask extends Hygiene{
    public Mask(String name, String price, Integer quantity, String unit, Integer amount) {
        super(name, price, quantity, unit, amount);
    }

    @Override
    public String toString() {
        return "Mask {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", количество в упаковке =" + amount +
                "} ";
    }
}
