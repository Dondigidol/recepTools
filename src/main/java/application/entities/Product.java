package application.entities;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {

    @Column(name = "lm")
    private String lm;
    @Column(name = "ean")
    private String ean;
    @Column(name = "name")
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
