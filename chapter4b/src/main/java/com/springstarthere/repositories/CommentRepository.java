package com.springstarthere.repositories;

import com.springstarthere.models.Comment;

public interface CommentRepository {
	void storeComment(Comment comment);
}
