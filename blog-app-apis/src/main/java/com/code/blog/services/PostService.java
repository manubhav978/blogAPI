package com.code.blog.services;

import java.util.List;

import com.code.blog.entities.Post;
import com.code.blog.payloads.PostDto;
import com.code.blog.payloads.PostResponse;

public interface PostService {

	//create
	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//getAll posts
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//get Single post
	
	PostDto getPostById(Integer postId);
	
	//get All post by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post by user
	
	List<PostDto> getPostByUser(Integer userId);
	
	//search posts
	
	List<PostDto> searchPosts(String keyword);
	
}
