package application.entities;

public class Product {
    private String lm;
    private String ean;
    private String name;

    public Product(){

    }

    public Product(String lm, String ean, String name) {
        this.lm = lm;
        this.ean = ean;
        this.name = name;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
