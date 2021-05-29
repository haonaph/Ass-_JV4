package com.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="favorites")
public class Favorite {
	
  public Favorite() {
	super();
}
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "likeDate")
	private Date likeDate;
	
//	 @ManyToOne
//	 @JoinColumn(name="user_id")
	@Column(name = "user_id")
	 private Integer user;
	 
	 public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getVideo() {
		return video;
	}

	public void setVideo(Integer video) {
		this.video = video;
	}
//	@ManyToOne
//	 @JoinColumn(name="videoId")
	@Column(name = "videoId")
	 private Integer video;
	 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}

	@Override
	public String toString() {
		return "Favorite [id=" + id + ", likeDate=" + likeDate + ", user=" + user + ", video=" + video + "]";
	}
	
	
	
}
