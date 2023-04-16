package Homework01;

public class Milk extends Drink{
    public Integer fat_percent;
    public int exDate;

    public Milk(String name, String price, Integer quantity, String unit, Integer volume, Integer fat_percent, int exDate) {
        super(name, price, quantity, unit, volume);
        this.fat_percent = fat_percent;
        this.exDate = exDate;
    }

    @Override
    public String toString() {
        return "Milk {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", процентность жира =" + fat_percent +
                ", срок годности =" + exDate +
                "} " ;
    }
}
