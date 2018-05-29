package citi.dao.impl;
// Generated 2018-5-28 2:23:43 by Hibernate Tools 5.0.6.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import citi.entity.Stationery;

/**
 * Home object for domain model class Stationery.
 * @see citi.entity.Stationery
 * @author Hibernate Tools
 */
@Stateless
public class StationeryHome {

	private static final Log log = LogFactory.getLog(StationeryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Stationery transientInstance) {
		log.debug("persisting Stationery instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Stationery persistentInstance) {
		log.debug("removing Stationery instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Stationery merge(Stationery detachedInstance) {
		log.debug("merging Stationery instance");
		try {
			Stationery result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Stationery findById(int id) {
		log.debug("getting Stationery instance with id: " + id);
		try {
			Stationery instance = entityManager.find(Stationery.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
