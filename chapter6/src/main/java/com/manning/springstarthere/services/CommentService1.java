package com.manning.springstarthere.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.manning.springstarthere.annotations.ToLog0;
import com.manning.springstarthere.annotations.ToLog1;
import com.manning.springstarthere.annotations.ToLog2;
import com.manning.springstarthere.models.Comment;

@Service
public class CommentService1 {
	private static final Logger logger = Logger.getLogger(CommentService1.class.getName());

	public void publishComment1(Comment comment) {
		logger.info(comment.toString());
	}

	public String publishComment2(Comment comment) {
		logger.info(comment.toString());
		return "SUCCESS";
	}

	public void editComment(Comment comment) {
		logger.info(comment.getAuthor() + "'s comment gets edited");
	}

	@ToLog0
	public void deleteComment(Comment comment) {
		logger.info(comment.getAuthor() + "'s comment gets deleted");
	}

	@ToLog1
	public String publishComment3(Comment comment) {
		logger.info(comment.toString());
		return "SUCCESS";
	}

	@ToLog2
	public String publishComment4(Comment comment) {
		logger.info(comment.toString());
		return "SUCCESS";
	}
}
