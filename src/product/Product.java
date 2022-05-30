package product;

import category.Category;
import providers.Provider;

public class Product extends Provider implements Category {
    private String name;
    private String code;
    private String category;
    private double price;
    private int amount;

    public Product(String provided, String address,String name, String code, double price, int amount) {
        super(provided,address);
        this.name = name;
        this.code = code;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProvided() {
        return super.getProvider();
    }

    public String getAddress() {
        return super.getAdress();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void setCategory(String name) {
        this.category = name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public double totalDue() {
        return (price * amount);
    }
}
