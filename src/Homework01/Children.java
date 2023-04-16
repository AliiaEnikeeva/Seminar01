package Homework01;

public class Children extends Product{
    private Integer min_age;
    private Boolean hipoallergenicity;

    public Children(String name, String price, Integer quantity, String unit, Integer min_age, Boolean hipoallergenicity) {
        super(name, price, quantity, unit);
        this.min_age = min_age;
        this.hipoallergenicity = hipoallergenicity;
    }

    @Override
    public String toString() {
        return "Children {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", минимальный возраст =" + min_age + '\'' +
                ", гипоаллергенность =" + hipoallergenicity  + '\'' +
                "}";
    }
}
