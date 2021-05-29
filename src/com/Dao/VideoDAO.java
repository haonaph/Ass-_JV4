package com.Dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.Utils.HibernateUtils;
import com.entity.User;
import com.entity.Video;


public class VideoDAO {
	private Session hSession;

	public VideoDAO() {
		this.hSession = HibernateUtils.getSession();
	}

	public Video store(Video entipy) {

		this.hSession.beginTransaction();
		int id = (Integer) this.hSession.save(entipy);
		this.hSession.getTransaction().commit(); 
		entipy.setId(id);
		return entipy;
	}

	public List<Video> paginate(int offset, int perPage) {
		String hql = "FROM Video";
		Query query = this.hSession.createQuery(hql);

		query.setFirstResult(offset);
		query.setMaxResults(offset + perPage);

		List<Video> result = query.getResultList();
		return result;

	}
	public void delete(Video entipy) {
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
	
	public void update(Video entipy) {

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

	
	public Video findbyid(int id) {
		
		Video entipy = this.hSession.get(Video.class, id);
		return entipy;
	}
	
	
	}