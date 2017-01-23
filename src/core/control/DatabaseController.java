package core.control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseController {
	EntityManager entityManager;
	EntityManagerFactory entityManagerFactory;

	public DatabaseController() {
		setEntityManagerFactory(Persistence.createEntityManagerFactory("objectdb:resources/database/craftware.odb"));
	}

	public void closeDatabase() {
		getEntityManagerFactory().close();
	}

	public void closeTransaction() {
		getEntityManager().close();
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @return the entityManagerFactory
	 */
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void killConnection() {
		if (entityManager.isOpen()) {
			closeTransaction();
		}
		if (entityManagerFactory.isOpen()) {
			closeDatabase();
		}
	}

	public List<?> readFromDatabase(Class<?> entity) {
		setEntityManager(entityManagerFactory.createEntityManager());
		getEntityManager().getTransaction().begin();
		return getEntityManager().createQuery("SELECT e FROM " + entity.getName() + " AS e").getResultList();
	}

	/**
	 * @param entityManager
	 *            the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * @param entityManagerFactory
	 *            the entityManagerFactory to set
	 */
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void writeToDatabase(Object object) {
		entityManager.getTransaction().begin();
		entityManager.persist(object);
		entityManager.getTransaction().commit();
	}
}
