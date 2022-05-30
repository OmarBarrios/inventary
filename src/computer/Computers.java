package computer;

import product.Product;

public class Computers extends Product {
    private String type;

    public Computers(String provided, String address, String name, String code, double price, int amount, String type) {
        super(provided, address, name, code, price, amount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
