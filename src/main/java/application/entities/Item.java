package application.entities;


public class Item {

    private int lm;
    private String ean;
    private String name;
    private int orderId;
    private String recepDate;
    private int recepId;
    private int quantity;
    private int supplierId;
    private String supplierName;
    private int department;
    private String reason;


    public int getLm() {
        return lm;
    }

    public void setLm(int lm) {
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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getRecepDate() {
        return recepDate;
    }

    public void setRecepDate(String recepDate) {
        this.recepDate = recepDate;
    }

    public int getRecepId() {
        return recepId;
    }

    public void setRecepId(int recepId) {
        this.recepId = recepId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
