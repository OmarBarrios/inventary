package providers;

public abstract class Provider {
    private String provider;
    private String address;

    public Provider(String provider, String address) {
        this.provider = provider;
        this.address = address;
    }

    public abstract double totalDue();

    public String getProvider() {
        return provider;
    }

    public String getAdress() {
        return address;
    }
}
