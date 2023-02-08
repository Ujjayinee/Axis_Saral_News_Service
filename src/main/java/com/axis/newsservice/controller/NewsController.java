package com.axis.newsservice.controller;

import java.util.List;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.newsservice.dto.NewsDto;
import com.axis.newsservice.entity.News;
import com.axis.newsservice.service.NewsService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	

	
//	@Autowired
//	private ModelMapper modelmapper;
	
	
	@GetMapping("/view-news/{newsId}")
	public NewsDto getNewsById(@PathVariable int newsId) {
		
		 return newsService.getNewsById(newsId);
	}
	
	@GetMapping("/allnews")
	public List<NewsDto> getAllNews(){
		return newsService.getAllNews();
	}
	
	@PostMapping("/add-news")
	public ResponseEntity<String> addNews(@RequestBody News news){
		newsService.addNews(news);
		return new ResponseEntity<>("News Added Successfully..",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-news/{newsId}")
	public ResponseEntity<String> deleteNewsById(@PathVariable int newsId){
		newsService.deleteNewsById(newsId);
		return new ResponseEntity<String>("News deleted Successfully..",HttpStatus.OK);
	}
	
//	@PutMapping("/news/update/{newsId}")
//	public ResponseEntity<String> updateNewsInfo(@PathVariable int newsId, @RequestBody News news){
//		newsService.updateNewsById(newsId, news);
//		return new ResponseEntity<String>("News Updated Successfully..",HttpStatus.OK);
//	}
}
