package com.springstarthere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstarthere.repositories.CommentRepository0;

@Service
public class UserService0 {
	@Autowired
	private CommentRepository0 commentRepo;

	public CommentRepository0 getCommentRepo() {
		return this.commentRepo;
	}	
}
