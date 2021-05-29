package com.Dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.Utils.HibernateUtils;
import com.entity.Favorite;
import com.entity.User;
import com.entity.Video;

public class FavoriteDAO {
	private Session hSession;
	
	
 public FavoriteDAO() {
	this.hSession = HibernateUtils.getSession();
}
 
 public Favorite store(Favorite entipy) {

		this.hSession.beginTransaction();
		Integer id = (Integer) this.hSession.save(entipy);
		this.hSession.getTransaction().commit();

		entipy.setId(id);
		return entipy;
	}

	public List<Favorite> paginate(int offset, int perPage) {
		String hql = "FROM Favorite";
		Query query = this.hSession.createQuery(hql);

		query.setFirstResult(offset);
		query.setMaxResults(offset + perPage);

		List<Favorite> result = query.getResultList();
		return result;

	}

	public Favorite findbyid(int id) {
		
		Favorite entipy = this.hSession.get(Favorite.class, id);
		return entipy;
	}
	
	
	public Favorite findbyVideo(int video ,int user) {
		
		String hql="SELECT entity FROM Favorite entity WHERE "
				+ "entity.video =:video "
				+ "AND entity.user=:user";
		Query query = this.hSession.createQuery(hql);
		query.setParameter("video", video);
		query.setParameter("user", user);
		try {
			Favorite entipy = (Favorite) query.getSingleResult();
			return entipy;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
 
	public void saveLike(int UserID, int VideoID) {
		Favorite entipy = new Favorite();
		User user = this.hSession.find(User.class, UserID);
		Video video = this.hSession.find(Video.class, VideoID);
		entipy.setUser(user.getId());
		entipy.setVideo(video.getId());
		entipy.setLikeDate(new Date());
		
		try {
			this.hSession.beginTransaction();
			this.hSession.save(entipy);
			this.hSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			this.hSession.getTransaction().rollback();
		}
	}
	
}
