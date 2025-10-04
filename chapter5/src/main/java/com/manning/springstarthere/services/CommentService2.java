package com.manning.springstarthere.services;

import org.springframework.stereotype.Service;

import com.manning.springstarthere.repositories.CommentRepository0;

@Service
public class CommentService2 {
	private final CommentRepository0 commentRepo;

	public CommentService2(CommentRepository0 commentRepo) {
		this.commentRepo = commentRepo;
	}

	public CommentRepository0 getCommentRepo() {
		return this.commentRepo;
	}
}
