package com.axis.newsservice.dto;

import java.util.Date;


public class CommentDto {

	private int commentId;
	private String empId;
	private String message;
	
	private String empName;
	
	
	public CommentDto() {
	}


	public CommentDto(int commentId, String empId, String message, String empName) {
	//	super();
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


	


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}
