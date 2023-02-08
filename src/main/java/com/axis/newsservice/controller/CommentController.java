package com.axis.newsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.newsservice.entity.Comment;
import com.axis.newsservice.service.CommentService;


@RestController
@CrossOrigin("http://localhost:3000/")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/add-comment/{newsId}")
	public ResponseEntity<String> addComment(@RequestBody Comment comment,@PathVariable int newsId) {
		commentService.addComment(comment, newsId);
		return new ResponseEntity<>("Comment Added....", HttpStatus.CREATED);
	}

	@PutMapping("/update-comment/{commentId}")
	public ResponseEntity<String> updateComment(@RequestBody Comment updatedComment,@PathVariable int commentId){
		return new ResponseEntity<>("Comment Updated....",HttpStatus.OK);
	}
	

	@DeleteMapping("/delete-comment/{commentId}")
	public ResponseEntity<String> deleteCommentById(@PathVariable int commentId){
		commentService.deleteComment(commentId);
		return new ResponseEntity<>("Comment with ID: " + commentId + " is deleted...", HttpStatus.OK);
	}
}
