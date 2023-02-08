package com.axis.newsservice.service;

import java.util.List;

import com.axis.newsservice.dto.NewsDto;
import com.axis.newsservice.entity.News;

public interface NewsService {

	List<NewsDto> getAllNews();
	NewsDto getNewsById(int newsId);
	void addNews(News news);
	void deleteNewsById(int newsId);
	void updateNewsById(int newsId, News updatedNews);
}
