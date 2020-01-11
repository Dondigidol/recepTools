package application.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordloc", schema = "rms_p009qtz_rms_ods")
public class OrderInfo {

    @Id
    @Column
    private String nk;
    @Column
    private Integer order_no;
    @Column
    private String item;
    @Column
    private Integer location;
    @Column
    private Character loc_type;
    @Column
    private Long unit_retail;
    @Column
    private Integer qty_ordered;
    @Column
    private Integer qty_prescaled;
    @Column
    private Integer qty_received;
    @Column
    private Integer last_received;
    @Column
    private Integer last_rounded_qty;
    @Column
    private Integer last_grp_rounded_qty;
    @Column
    private Integer qty_cancelled;
    @Column
    private Character cancel_code;
    @Column
    private Date cancel_date;
    @Column
    private String cancel_id;
    @Column
    private Integer original_repl_qty;
    @Column
    private Float unit_cost;
    @Column
    private Float unit_cost_init;
    @Column
    private String cost_source;
    @Column
    private Character non_scale_ind;
    @Column
    private Integer tsf_po_link_no;
    @Column
    private Date estimated_instock_date;
    @Column
    private Date valid_from_dttm;
    @Column
    private Date created_dttm;
    @Column
    private Date updated_dttm;
    @Column
    private String md5_hash;
    @Column
    private Character is_actual;

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getCreated_dttm() {
        return created_dttm;
    }

    public void setCreated_dttm(Date created_dttm) {
        this.created_dttm = created_dttm;
    }

    public Integer getQty() {
        return qty_ordered;
    }

    public void setQty(int qty) {
        this.qty_ordered = qty;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }



    //----

    public String getNk() {
        return nk;
    }

    public void setNk(String nk) {
        this.nk = nk;
    }

    public Character getLocType() {
        return loc_type;
    }

    public void setLocType(char locType) {
        this.loc_type = locType;
    }

    public Long getUnitRetail() {
        return unit_retail;
    }

    public void setUnitRetail(Long unitRetail) {
        this.unit_retail = unitRetail;
    }

    public Integer getQty_ordered() {
        return qty_ordered;
    }

    public void setQty_ordered(int qty_ordered) {
        this.qty_ordered = qty_ordered;
    }

    public Integer getQty_prescaled() {
        return qty_prescaled;
    }

    public void setQty_prescaled(int qty_prescaled) {
        this.qty_prescaled = qty_prescaled;
    }

    public Integer getQty_received() {
        return qty_received;
    }

    public void setQty_received(int qty_received) {
        this.qty_received = qty_received;
    }

    public Integer getLast_received() {
        return last_received;
    }

    public void setLast_received(int last_received) {
        this.last_received = last_received;
    }

    public Integer getLast_rounded_qty() {
        return last_rounded_qty;
    }

    public void setLast_rounded_qty(int last_rounded_qty) {
        this.last_rounded_qty = last_rounded_qty;
    }

    public Integer getLast_grp_rounded_qty() {
        return last_grp_rounded_qty;
    }

    public void setLast_grp_rounded_qty(int last_grp_rounded_qty) {
        this.last_grp_rounded_qty = last_grp_rounded_qty;
    }

    public Integer getQty_cancelled() {
        return qty_cancelled;
    }

    public void setQty_cancelled(int qty_cancelled) {
        this.qty_cancelled = qty_cancelled;
    }

    public Character getCancel_code() {
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

    public Integer getOriginal_repl_qty() {
        return original_repl_qty;
    }

    public void setOriginal_repl_qty(int original_repl_qty) {
        this.original_repl_qty = original_repl_qty;
    }

    public Float getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(float unit_cost) {
        this.unit_cost = unit_cost;
    }

    public Float getUnit_cost_init() {
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

    public Character getNon_scale_ind() {
        return non_scale_ind;
    }

    public void setNon_scale_ind(char non_scale_ind) {
        this.non_scale_ind = non_scale_ind;
    }

    public Integer getTsf_po_link_no() {
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

    public Character getIs_actual() {
        return is_actual;
    }

    public void setIs_actual(char is_actual) {
        this.is_actual = is_actual;
    }
}
