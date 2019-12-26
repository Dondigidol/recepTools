package application.entities;


public class Item {

    private String lm;
    private String ean;
    private String name;
    private String orderId;
    private String recepDate;
    private String recepId;
    private int quantity;
    private String supplierId;
    private String supplierName;
    private String department;
    private String reason;


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

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
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
}
