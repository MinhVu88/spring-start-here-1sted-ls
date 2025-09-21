package com.springstarthere.services;

import com.springstarthere.models.Comment;
import com.springstarthere.proxies.NotificationProxy;
import com.springstarthere.repositories.CommentRepository;

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
