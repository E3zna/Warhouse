package app;

public class ProductInfo {
    static String name;
    static double weight;
    static int quantity;
    static double totalWeight;
    static Product product;
    private static final String MEASURE = "кг";

    public static void main(String[] args) {
        product = new Product();
        name = "Apple";
        quantity = 35;
        weight = 56.67;
        totalWeight = (double)quantity * weight;
        System.out.println("------------------------\n" +
                "Общий вес товара " + name + " (" + MEASURE + "): "
                + totalWeight);
    }
}
