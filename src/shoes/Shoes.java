package shoes;

import product.Product;

public class Shoes extends Product {
    private double size;

    public Shoes(String provided, String address, String name, String code, double price, int amount, double size) {
        super(provided, address, name, code, price, amount);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

}
