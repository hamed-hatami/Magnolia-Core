package ir.magnolia.core.model.entity;

import javax.persistence.*;

/**
 * Created by a c e r on 15/10/2016.
 */
@Entity
@Table(name = "tb_geography")
public class Geography extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "geography_name")
    private String name;
    @Column(name = "geography_type")
    private String type;

    public Geography() {
    }

    public Geography(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
