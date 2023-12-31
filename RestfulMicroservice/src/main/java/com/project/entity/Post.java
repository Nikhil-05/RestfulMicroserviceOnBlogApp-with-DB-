package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@Column(name="id")
	int postId;
	@Column(name="title")
	String title;
	@Column(name="body")
	String body;
	
	public Post() {
		
	}
	
	public Post(int postId, String title, String body) {
		this.postId = postId;
		this.title = title;
		this.body = body;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", body=" + body + "]";
	}
	
	
	
	

}
