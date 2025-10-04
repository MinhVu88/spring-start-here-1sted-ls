package com.manning.springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manning.springstarthere.repositories.CommentRepository1;

@Service
public class UserService1 {
	@Autowired
	private CommentRepository1 commentRepo;

	public CommentRepository1 getCommentRepo() {
		return this.commentRepo;
	}	
}
