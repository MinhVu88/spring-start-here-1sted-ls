package com.manning.springstarthere.services;

import com.manning.springstarthere.models.Comment;
import com.manning.springstarthere.proxies.NotificationProxy;
import com.manning.springstarthere.repositories.CommentRepository;

public class CommentService {
	private final CommentRepository commentRepo;
	private final NotificationProxy notificationProxy;
	
	public CommentService(
		CommentRepository commentRepo, 
		NotificationProxy notificationProxy
	) {
		this.commentRepo = commentRepo;
		this.notificationProxy = notificationProxy;
	}

	public void publishComment(Comment comment) {
		this.commentRepo.storeComment(comment);
		this.notificationProxy.sendNotification(comment);
	}
}
