package citi.dao.impl;
// Generated 2018-5-28 2:23:43 by Hibernate Tools 5.0.6.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import citi.entity.Orders;

/**
 * Home object for domain model class Orders.
 * @see citi.entity.Orders
 * @author Hibernate Tools
 */
@Stateless
public class OrdersHome {

	private static final Log log = LogFactory.getLog(OrdersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Orders transientInstance) {
		log.debug("persisting Orders instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Orders persistentInstance) {
		log.debug("removing Orders instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Orders merge(Orders detachedInstance) {
		log.debug("merging Orders instance");
		try {
			Orders result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Orders findById(String id) {
		log.debug("getting Orders instance with id: " + id);
		try {
			Orders instance = entityManager.find(Orders.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
