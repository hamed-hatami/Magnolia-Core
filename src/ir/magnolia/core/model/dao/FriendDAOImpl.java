package ir.magnolia.core.model.dao;

import ir.magnolia.core.model.entity.Friend;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class FriendDAOImpl<T extends Friend> extends BaseDAOImpl<T> {

    public T findByNationalCode(String nationalCode) {
        try {
            return (T) em.createNamedQuery("Friend.findByNationalCode")
                    .setParameter("nationalCode", nationalCode)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
