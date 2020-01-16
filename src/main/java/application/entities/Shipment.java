package application.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "shipsku", schema = "rms_p009qtzb_rms_ods")
public class Shipment {

    @Id
    @Column(name="shipment")
    private Long id;
    @Column(name="item")
    private String lm;
    @Column(name = "created_dttm")
    private Date createdDate;
    @Column(name = "qty_received")
    private Integer qtyReceived;
    @Column(name = "qty_expected")
    private Integer qtyExpected;

    public void setId(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getQtyReceived() {
        return qtyReceived;
    }

    public void setQtyReceived(Integer qtyReceived) {
        this.qtyReceived = qtyReceived;
    }

    public Integer getQtyExpected() {
        return qtyExpected;
    }

    public void setQtyExpected(Integer qtyExpected) {
        this.qtyExpected = qtyExpected;
    }
}
