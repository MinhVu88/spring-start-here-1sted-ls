package com.springstarthere;

import com.springstarthere.models.Comment;
import com.springstarthere.proxies.NotificationProxyImpl;
import com.springstarthere.repositories.CommentRepoImpl;
import com.springstarthere.services.CommentService;

public class Main {
	public static void main(String[] args) {
		var commentRepo = new CommentRepoImpl();
		var notificationProxy = new NotificationProxyImpl();

		var comment = new Comment("Elliot Alderson", "the world itself is just one big hoax");

		var commentService = new CommentService(commentRepo, notificationProxy);
		commentService.publishComment(comment);
	}
}