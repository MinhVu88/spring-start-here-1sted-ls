package com.manning.springstarthere;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manning.springstarthere.models.Comment;
import com.manning.springstarthere.services.CommentService;

public class Main {
	public static void main(String[] args) {
		try(var ctx = new AnnotationConfigApplicationContext(Config.class)) {
			var commentService = ctx.getBean(CommentService.class);
			var comment = new Comment("Darlene Alderson", "our democracy has been hacked");
			commentService.publishComment(comment);
		} catch(BeansException e) {
			System.out.println("\nException -> " + e.toString() + "\n");
		}
	}
}