package com.axis.newsservice.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.newsservice.entity.Comment;


@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer>{

}
