package com.axis.newsservice.service;



import com.axis.newsservice.entity.Comment;

public interface CommentService {
	void addComment(Comment comment,int newsId);
	void deleteComment(int commentId);
	void updateComment(int commentId);
	
}
