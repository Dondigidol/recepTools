package application.entities;

import javax.persistence.*;
import java.util.Date;


@Embeddable
class OrderInfoPK{

    @ManyToOne
    @JoinColumn(name ="entity_id")
    private Entity entity;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}

@Entity
@Table(name = "ordloc", schema = "rms_p009qtz_rms_ods")
public class OrderInfo {

    @EmbeddedId
    @GeneratedValue
    private OrderInfoPK id;
    private String nk;
    @Column(name = "order_no")
    private int orderNo;
    @Column(name = "item")
    private String lm;
    @Column(name = "location")
    private int storeId;

    private char locType;
    private Long unitRetail;
    @Column(name = "qty_ordered")
    private int qtyOrdered;
    private int qty_prescaled;
    private int qty_received;
    private int last_received;
    private int last_rounded_qty;
    private int last_grp_rounded_qty;
    private int qty_cancelled;
    private char cancel_code;
    private Date cancel_date;
    private String cancel_id;
    private int original_repl_qty;
    private float unit_cost;
    private float unit_cost_init;
    private String cost_source;
    private char non_scale_ind;
    private int tsf_po_link_no;
    private Date estimated_instock_date;
    private Date valid_from_dttm;
    @Column(name = "created_dttm")
    private Date date;
    private Date updated_dttm;
    private String md5_hash;
    private char is_actual;



    public OrderInfoPK getId() {
        return id;
    }

    public void setId(OrderInfoPK id) {
        this.id = id;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQty() {
        return qtyOrdered;
    }

    public void setQty(int qty) {
        this.qtyOrdered = qty;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }



    //----

    public String getNk() {
        return nk;
    }

    public void setNk(String nk) {
        this.nk = nk;
    }

    public char getLocType() {
        return locType;
    }

    public void setLocType(char locType) {
        this.locType = locType;
    }

    public Long getUnitRetail() {
        return unitRetail;
    }

    public void setUnitRetail(Long unitRetail) {
        this.unitRetail = unitRetail;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public int getQty_prescaled() {
        return qty_prescaled;
    }

    public void setQty_prescaled(int qty_prescaled) {
        this.qty_prescaled = qty_prescaled;
    }

    public int getQty_received() {
        return qty_received;
    }

    public void setQty_received(int qty_received) {
        this.qty_received = qty_received;
    }

    public int getLast_received() {
        return last_received;
    }

    public void setLast_received(int last_received) {
        this.last_received = last_received;
    }

    public int getLast_rounded_qty() {
        return last_rounded_qty;
    }

    public void setLast_rounded_qty(int last_rounded_qty) {
        this.last_rounded_qty = last_rounded_qty;
    }

    public int getLast_grp_rounded_qty() {
        return last_grp_rounded_qty;
    }

    public void setLast_grp_rounded_qty(int last_grp_rounded_qty) {
        this.last_grp_rounded_qty = last_grp_rounded_qty;
    }

    public int getQty_cancelled() {
        return qty_cancelled;
    }

    public void setQty_cancelled(int qty_cancelled) {
        this.qty_cancelled = qty_cancelled;
    }

    public char getCancel_code() {
        return cancel_code;
    }

    public void setCancel_code(char cancel_code) {
        this.cancel_code = cancel_code;
    }

    public Date getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(Date cancel_date) {
        this.cancel_date = cancel_date;
    }

    public String getCancel_id() {
        return cancel_id;
    }

    public void setCancel_id(String cancel_id) {
        this.cancel_id = cancel_id;
    }

    public int getOriginal_repl_qty() {
        return original_repl_qty;
    }

    public void setOriginal_repl_qty(int original_repl_qty) {
        this.original_repl_qty = original_repl_qty;
    }

    public float getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(float unit_cost) {
        this.unit_cost = unit_cost;
    }

    public float getUnit_cost_init() {
        return unit_cost_init;
    }

    public void setUnit_cost_init(float unit_cost_init) {
        this.unit_cost_init = unit_cost_init;
    }

    public String getCost_source() {
        return cost_source;
    }

    public void setCost_source(String cost_source) {
        this.cost_source = cost_source;
    }

    public char getNon_scale_ind() {
        return non_scale_ind;
    }

    public void setNon_scale_ind(char non_scale_ind) {
        this.non_scale_ind = non_scale_ind;
    }

    public int getTsf_po_link_no() {
        return tsf_po_link_no;
    }

    public void setTsf_po_link_no(int tsf_po_link_no) {
        this.tsf_po_link_no = tsf_po_link_no;
    }

    public Date getEstimated_instock_date() {
        return estimated_instock_date;
    }

    public void setEstimated_instock_date(Date estimated_instock_date) {
        this.estimated_instock_date = estimated_instock_date;
    }

    public Date getValid_from_dttm() {
        return valid_from_dttm;
    }

    public void setValid_from_dttm(Date valid_from_dttm) {
        this.valid_from_dttm = valid_from_dttm;
    }

    public Date getUpdated_dttm() {
        return updated_dttm;
    }

    public void setUpdated_dttm(Date updated_dttm) {
        this.updated_dttm = updated_dttm;
    }

    public String getMd5_hash() {
        return md5_hash;
    }

    public void setMd5_hash(String md5_hash) {
        this.md5_hash = md5_hash;
    }

    public char getIs_actual() {
        return is_actual;
    }

    public void setIs_actual(char is_actual) {
        this.is_actual = is_actual;
    }
}
