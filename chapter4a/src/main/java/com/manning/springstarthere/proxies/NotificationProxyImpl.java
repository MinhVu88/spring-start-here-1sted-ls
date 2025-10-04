package com.manning.springstarthere.proxies;

import com.manning.springstarthere.models.Comment;

public class NotificationProxyImpl implements NotificationProxy {
	@Override
	public void sendNotification(Comment comment) {
		System.out.println(
			"notification(s) sent to " + comment.getAuthor() + 
			", based on his/her comment: " + comment.getContent()
		);
	}
}
