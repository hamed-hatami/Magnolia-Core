package ir.magnolia.core.model.dao;

import ir.magnolia.core.model.entity.Friend;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class FriendDAOImpl<T extends Friend> extends BaseDAOImpl<T> {

}
