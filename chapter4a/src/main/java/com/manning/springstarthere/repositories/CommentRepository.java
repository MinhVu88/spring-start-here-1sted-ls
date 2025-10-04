package com.manning.springstarthere.repositories;

import com.manning.springstarthere.models.Comment;

public interface CommentRepository {
	void storeComment(Comment comment);
}
