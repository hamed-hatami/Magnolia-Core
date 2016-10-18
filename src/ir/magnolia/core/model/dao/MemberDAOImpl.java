package ir.magnolia.core.model.dao;

import ir.magnolia.core.model.entity.Member;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class MemberDAOImpl<T extends Member> extends BaseDAOImpl<T> {

    public T findByCodeAndMobileNumber(String mobileNumber, String generatedCode) {
        try {
            return (T) em.createNamedQuery("Member.findByCode")
                    .setParameter("number", mobileNumber)
                    .setParameter("code", generatedCode)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
