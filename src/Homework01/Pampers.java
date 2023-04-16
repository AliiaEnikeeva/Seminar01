package Homework01;

public class Pampers extends Children{
    private String size;
    private String min_weight;
    private String max_weight;
    private String type;

    public Pampers(String name, String price, Integer quantity, String unit, Integer min_age, Boolean hipoallergenicity, String size, String min_weight, String max_weight, String type) {
        super(name, price, quantity, unit, min_age, hipoallergenicity);
        this.size = size;
        this.min_weight = min_weight;
        this.max_weight = max_weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pampers {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", размер ='" + size + '\'' +
                ", минимальный вес ='" + min_weight + '\'' +
                ", максимальный вес ='" + max_weight + '\'' +
                ", тип ='" + type + '\'' +
                "} ";
    }
}
