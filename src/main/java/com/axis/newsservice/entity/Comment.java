package com.axis.newsservice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	private int commentId;
	private String empId;
	private String message;

	private String empName;
	

	@ManyToOne
	private News news;
	
	
	public Comment() {
	}

	public Comment(int commentId, String empId, String message, String empName) {
		//super();
		this.commentId = commentId;
		this.empId = empId;
		this.message = message;
		
		this.empName = empName;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", empId=" + empId + ", message=" + message + ", empName=" + empName
				+ ", news=" + news + "]";
	}



	
	
}
