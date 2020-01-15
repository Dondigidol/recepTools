package application.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipment", schema = "rms_p009qtzb_rms_ods")
public class OrderReceiveChain {

    @Id
    private Long shipment;
    //@Column(name = "order_no")
    private Long order_no;

    public Long getShipment() {
        return shipment;
    }

    public void setShipment(Long shipment) {
        this.shipment = shipment;
    }

    public Long getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Long order_no) {
        this.order_no = order_no;
    }
}
