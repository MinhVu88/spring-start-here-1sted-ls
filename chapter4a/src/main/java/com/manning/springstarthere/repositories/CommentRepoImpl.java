package com.manning.springstarthere.repositories;

import com.manning.springstarthere.models.Comment;

public class CommentRepoImpl implements CommentRepository {
	@Override
	public void storeComment(Comment comment) {
		System.out.println("storing comment: " + comment.getContent());
	}
}
