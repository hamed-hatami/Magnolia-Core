package ir.magnolia.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BaseEntity implements Serializable {

    @NotNull
    @Column(name = "register_date")
    private String registerDate;

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}
