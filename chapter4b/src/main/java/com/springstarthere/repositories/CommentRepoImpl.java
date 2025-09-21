package com.springstarthere.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springstarthere.models.Comment;

@SuppressWarnings("unused")
// @Component
@Repository
public class CommentRepoImpl implements CommentRepository {
	@Override
	public void storeComment(Comment comment) {
		System.out.println("storing comment: " + comment.getContent());
	}
}
