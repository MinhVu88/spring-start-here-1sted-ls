package com.manning.springstarthere.proxies;

import com.manning.springstarthere.models.Comment;

public interface NotificationProxy {
	void sendNotification(Comment comment);
}
