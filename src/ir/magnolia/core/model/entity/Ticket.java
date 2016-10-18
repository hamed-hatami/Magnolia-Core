package ir.magnolia.core.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by a c e r on 18/10/2016.
 */
@Entity
@Table(name = "tb_ticket")
public class Ticket extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "fly_date")
    private String flyDate;
    @Column(name = "price")
    private BigDecimal price;

    public Ticket(String flyDate, BigDecimal price) {
        this.flyDate = flyDate;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlyDate() {
        return flyDate;
    }

    public void setFlyDate(String flyDate) {
        this.flyDate = flyDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
