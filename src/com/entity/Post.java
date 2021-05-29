package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}
	
 @Id
 @Column(name="id")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 
 @Column(name="title")
 private String title;
 
 @Column(name="contents")
 private String contents;
 
 @Column(name="img")
 private String img;
 
// SELECT * FROM posts


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContents() {
	return contents;
}

public void setContents(String contents) {
	this.contents = contents;
}

public String getImg() {
	return img;
}

public void setImg(String img) {
	this.img = img;
}

}
 
 
