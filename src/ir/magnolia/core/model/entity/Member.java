package ir.magnolia.core.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_member")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "membership_code")
    private String membershipCode;
    @Column(name = "last_modify_date")
    private String lastModificationDate;
    @Column(name = "member_active")
    private boolean active;

    public Member() {
    }

    public Member(String mobileNumber, String membershipCode, String lastModificationDate, boolean active) {
        this.mobileNumber = mobileNumber;
        this.membershipCode = membershipCode;
        this.lastModificationDate = lastModificationDate;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMembershipCode() {
        return membershipCode;
    }

    public void setMembershipCode(String membershipCode) {
        this.membershipCode = membershipCode;
    }

    public String getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
