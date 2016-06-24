package com.mns.blog.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BlogUserRelation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user_id;
	private Integer blog_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Integer getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(Integer blog_id) {
		this.blog_id = blog_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blog_id == null) ? 0 : blog_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlogUserRelation other = (BlogUserRelation) obj;
		if (blog_id == null) {
			if (other.blog_id != null)
				return false;
		} else if (!blog_id.equals(other.blog_id))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}

}
