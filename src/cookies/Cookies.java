package cookies;

import product.Product;

public class Cookies extends Product {
    String flavor;

    public Cookies(String provided, String address, String name, String code, double price, int amount, String flavor) {
        super(provided, address, name, code, price, amount);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
