/*
 * @author Trizna Yevhen
 * @version 1.0.0
 */
package app;

public class Product {

    private final String name;
    private final double weight;

    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
