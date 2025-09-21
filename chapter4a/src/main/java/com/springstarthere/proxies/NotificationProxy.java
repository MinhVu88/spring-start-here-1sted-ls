package com.springstarthere.proxies;

import com.springstarthere.models.Comment;

public interface NotificationProxy {
	void sendNotification(Comment comment);
}
