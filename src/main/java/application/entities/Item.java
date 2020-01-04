package application.entities;


import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lm;
    private String ean;
    private String name;
    private String orderId;
    private String recepDate;
    private String recepId;
    private int quantity;
    private String supplierName;
    private String department;
    private String reason;

    public Long getId() {
        return id;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRecepDate() {
        return recepDate;
    }

    public void setRecepDate(String recepDate) {
        this.recepDate = recepDate;
    }

    public String getRecepId() {
        return recepId;
    }

    public void setRecepId(String recepId) {
        this.recepId = recepId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString(){
        return("Item = {" +
                "id="+id+
                ", lm=" + lm +
                ", ean = " + ean +
                ", name = " + name +
                ", orderId="+orderId+
                ", recepDate="+recepDate+
                ", recepId="+recepId+
                ", quantity="+quantity+
                ", supplierName="+supplierName+
                ", department="+department+
                ", reason="+reason);
    }
}
