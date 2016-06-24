package com.mns.blog.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

public class BlogUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId BlogUserRelation id;
	
	   @MapsId("user_id")
	   @OneToOne UserLogin user;
	   
	   /*@MapsId("blog_id")
	   @OneToOne UserLogin user;*/

}
