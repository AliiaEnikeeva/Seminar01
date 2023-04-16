package Homework01;

import java.util.Date;

public class Drink extends Product{
    private Integer volume;

    public Drink(String name, String price, Integer quantity, String unit, Integer volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink {" +
                "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", объем =" + volume +
                '}';
    }
}

