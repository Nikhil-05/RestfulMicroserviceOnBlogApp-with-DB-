package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{

}
