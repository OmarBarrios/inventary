package computer;

public class ComputersLaptops extends Computers {
    private String trademark;

    public ComputersLaptops(String provided, String address, String name, String code, double price, int amount, String type, String trademark) {
        super(provided, address, name, code, price, amount, type);
        this.trademark = trademark;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }
}
