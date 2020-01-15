package application.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordloc", schema = "rms_p009qtzb_rms_ods")
public class Order {

    @Id
    @Column(name = "order_no")
    private Integer orderNo;
    @Column
    private String item;
    @Column(name = "location")
    private Integer store;
    @Column(name = "qty_ordered")
    private Integer qty;
    @Column(name = "unit_cost")
    private Float cost;
    @Column(name = "created_dttm")
    private Date createdDate;

    public Integer getOrder_no() {
        return orderNo;
    }

    public void setOrder_no(int order_no) {
        this.orderNo = order_no;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
