package application.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sups", schema = "rms_p009qtzb_rms_ods")
public class Supplier {

    @Id
    @Column(name = "supplier")
    private long id;
    @Column(name = "sup_name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
