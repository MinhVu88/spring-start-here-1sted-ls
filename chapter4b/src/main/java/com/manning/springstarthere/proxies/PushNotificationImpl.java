package com.manning.springstarthere.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.manning.springstarthere.models.Comment;

@Component
@Qualifier("push")
public class PushNotificationImpl implements NotificationProxy {
	@Override
	public void sendNotification(Comment comment) {
		System.out.println(
			"push notification sent to " + comment.getAuthor() + 
			", regarding the comment: " + comment.getContent()
		);
	}
}
