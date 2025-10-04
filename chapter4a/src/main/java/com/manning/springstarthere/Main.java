package com.manning.springstarthere;

import com.manning.springstarthere.models.Comment;
import com.manning.springstarthere.proxies.NotificationProxyImpl;
import com.manning.springstarthere.repositories.CommentRepoImpl;
import com.manning.springstarthere.services.CommentService;

public class Main {
	public static void main(String[] args) {
		var commentRepo = new CommentRepoImpl();
		var notificationProxy = new NotificationProxyImpl();

		var comment = new Comment("Elliot Alderson", "the world itself is just one big hoax");

		var commentService = new CommentService(commentRepo, notificationProxy);
		commentService.publishComment(comment);
	}
}