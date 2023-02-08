package com.axis.newsservice.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class NewsDto {

	private int newsId;
	private String newsName;
	private String content;
	private Date dateTime;
	private String url;
	
	private List<CommentDto> commentDto = new ArrayList<>();
	
	public NewsDto() {
	}

	public NewsDto(int newsId, String newsName, String content, Date dateTime,String url,List<CommentDto> commentDto) {
		super();
		this.newsId = newsId;
		this.newsName = newsName;
		this.content = content;
		this.dateTime = dateTime;
		this.commentDto = commentDto;
		this.url=url;
	}

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public List<CommentDto> getComments() {
		return commentDto;
	}

	public void setComments(List<CommentDto> commentDto) {
		this.commentDto = commentDto;
	}
	
	
	
	
}