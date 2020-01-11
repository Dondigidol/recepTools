package application.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordloc", schema = "rms_p009qtz_rms_ods")
public class OrderInfo {

    @Id
    @Column(name = "order_no")
    private Integer orderNo;
    @Column
    private String item;
    @Column
    private Integer location;
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

    public Integer getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
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
