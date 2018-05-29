package citi.dao.impl;
// Generated 2018-5-28 2:23:43 by Hibernate Tools 5.0.6.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import citi.entity.Systeminfo;

/**
 * Home object for domain model class Systeminfo.
 * @see citi.entity.Systeminfo
 * @author Hibernate Tools
 */
@Stateless
public class SysteminfoHome {

	private static final Log log = LogFactory.getLog(SysteminfoHomeTest.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Systeminfo transientInstance) {
		log.debug("persisting Systeminfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Systeminfo persistentInstance) {
		log.debug("removing Systeminfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Systeminfo merge(Systeminfo detachedInstance) {
		log.debug("merging Systeminfo instance");
		try {
			Systeminfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Systeminfo findById(int id) {
		log.debug("getting Systeminfo instance with id: " + id);
		try {
			Systeminfo instance = entityManager.find(Systeminfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
