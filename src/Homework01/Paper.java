package Homework01;

public class Paper extends Hygiene{
    private Integer layer;

    public Paper(String name, String price, Integer quantity, String unit, Integer amount, Integer layer) {
        super(name, price, quantity, unit, amount);
        this.layer = layer;
    }

    @Override
    public String toString() {
        return "Paper {" + "наименование ='" + name + '\'' +
                ", цена ='" + price + '\'' +
                ", количество =" + quantity +
                ", ед.изм. ='" + unit + '\'' +
                ", количество в упаковке =" + amount +
                ", количество слоев =" + layer +
                "} ";
    }
}
