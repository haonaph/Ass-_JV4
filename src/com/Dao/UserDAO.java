package com.Dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.Utils.HibernateUtils;
import com.entity.User;

public class UserDAO {
	private Session hSession;

	public UserDAO() {
		this.hSession = HibernateUtils.getSession();
	}

	public User store(User entipy) {

		this.hSession.beginTransaction();
		Integer id = (Integer) this.hSession.save(entipy);
		this.hSession.getTransaction().commit();

		entipy.setId(id);
		return entipy;
	}

	public List<User> paginate(int offset, int perPage) {
		String hql = "FROM User";
		Query query = this.hSession.createQuery(hql);

		query.setFirstResult(offset);
		query.setMaxResults(offset + perPage);

		List<User> result = query.getResultList();
		return result;

	}

	public User findbyid(int id) {
		User entipy = this.hSession.get(User.class, id);
		return entipy;
	}

	public void update(User entipy) {

		try {
			this.hSession.clear();
			this.hSession.beginTransaction();
			this.hSession.update(entipy);
			this.hSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			this.hSession.getTransaction().rollback();
		}
	}

	public void delete(User entipy) {
		this.hSession.clear();
		try {
			this.hSession.beginTransaction();

			this.hSession.delete(entipy);

			this.hSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			this.hSession.getTransaction().rollback();

			throw e;
		}
	}

	public User login(String email, String password) {

		String hql = "SELECT entipy FROM User entipy " + "WHERE entipy.email= :email AND entipy.password =:password ";
		Query query = this.hSession.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);

		try {
			User entipy = (User) query.getSingleResult();
			return entipy;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
