package application.entities;

import javax.persistence.*;

@Entity
@Table(name = "shipment", schema = "rms_p009qtzb_rms_ods")
public class OrderReceiveChain {

    @Id
    private Long shipment;
    @Column(name = "order_no")
    private Long orderNo;

    public void setShipment(Long shipment) {
        this.shipment = shipment;
    }

    public Long getShipment() {
        return shipment;
    }

    public void setSId(Long id) {
        this.shipment = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

}
