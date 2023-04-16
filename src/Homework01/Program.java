package Homework01;

public class Program {

    public static void main(String[] args) {
        Product[] products = {new Food("apple", "150", 10, "штук", 2024),
                new Drink("Cola", "190", 3, "литры", 3),
                new Bread("Boolka", "45", 1, "штук", 2023, "first"),
                new Children("ball", "40", 5, "штук", 1, true),
                new Dummy("Lilly", "200", 1, "штук", 1, true),
                new Egg("Egg", "199", 1, "лоток", 2023, 15),
                new Hygiene("Soap", "300", 5, "штук", 3),
                new Limonad("Buratino", "150", 3, "литры", 2),
                new Mask("Medic", "80", 5, "pack", 100),
                new Milk("Moloko", "70", 2, "литры", 1, 3,2023),
                new Pampers("Merris", "900", 4, "pack", 1, true, "small", "10", "14", "male"),
                new Paper("Zeva", "189", 2, "pack", 8, 3)};
                for (Product product: products) {
            getInfo(product);
        }

        }

        public static void getInfo(Product product) {
            System.out.println(product.toString());
        }


}
