package com.springstarthere.proxies;

import com.springstarthere.models.Comment;

public class NotificationProxyImpl implements NotificationProxy {
	@Override
	public void sendNotification(Comment comment) {
		System.out.println(
			"notification(s) sent to " + comment.getAuthor() + 
			", based on his/her comment: " + comment.getContent()
		);
	}
}
