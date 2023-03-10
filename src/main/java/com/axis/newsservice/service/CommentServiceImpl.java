package com.axis.newsservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.newsservice.entity.Comment;
import com.axis.newsservice.entity.News;
import com.axis.newsservice.repository.CommentRepository;
import com.axis.newsservice.repository.NewsRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private NewsRepository newsRepository;
	
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public void addComment(Comment comment, int newsId) {
		// TODO Auto-generated method stub
		News news=newsRepository.findById(newsId).get();
		comment.setNews(news);
		commentRepository.save(comment);
		
	}

	@Override
	public void deleteComment(int commentId) {
	commentRepository.deleteById(commentId);
	}

	@Override
	public void updateComment(int commentId) {
		// TODO Auto-generated method stub
		
	}


	

}
