package com.manning.springstarthere;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manning.springstarthere.models.Comment;
import com.manning.springstarthere.services.CommentService0;
import com.manning.springstarthere.services.CommentService1;
import com.manning.springstarthere.services.CommentService2;
import com.manning.springstarthere.services.CommentService4;
import com.manning.springstarthere.services.CommentService5;
import com.manning.springstarthere.services.CommentService6;
import com.manning.springstarthere.services.CommentService7;
import com.manning.springstarthere.services.UserService0;
import com.manning.springstarthere.services.UserService1;

public class Main {
	public static void main(String[] args) {
		try(var ctx = new AnnotationConfigApplicationContext(Config.class)) {
			System.out.println("\t\t[ SINGLETON-SCOPED BEANS ]\n");
			var cs0 = ctx.getBean("commentService0", CommentService0.class);
			var cs1 = ctx.getBean("commentService0", CommentService0.class);
			System.out.println("cs0 == cs1 => " + (cs0 == cs1));

			System.out.println("---------------------------------------------");

			var cs2 = ctx.getBean(CommentService1.class);
			var us0 = ctx.getBean(UserService0.class);

			System.out.println(
				"cs2.getCommentRepo() == us0.getCommentRepo() => " + 
				(cs2.getCommentRepo() == us0.getCommentRepo())
			);

			var cs3 = ctx.getBean(CommentService2.class);

			System.out.println(
				"cs3.getCommentRepo() == us0.getCommentRepo() => " + 
				(cs3.getCommentRepo() == us0.getCommentRepo())
			);

			System.out.println(
				"cs3.getCommentRepo() == cs2.getCommentRepo() => " + 
				(cs3.getCommentRepo() == cs2.getCommentRepo())
			);

			System.out.println("---------------------------------------------");

			ctx.getBean(CommentService4.class);

			System.out.println("\n\t\t[ PROTOTYPE-SCOPED BEANS ]\n");
			var cs4 = ctx.getBean("commentService5", CommentService5.class);
			var cs5 = ctx.getBean("commentService5", CommentService5.class);
			System.out.println("cs4 == cs5 => " + (cs4 == cs5));

			System.out.println("---------------------------------------------");

			var cs6 = ctx.getBean(CommentService6.class);
			var us1 = ctx.getBean(UserService1.class);

			System.out.println(
				"cs6.getCommentRepo() == us1.getCommentRepo() => " + 
				(cs6.getCommentRepo() == us1.getCommentRepo())
			);

			System.out.println("---------------------------------------------");

			var cs7 = ctx.getBean(CommentService7.class);

			String author = "Adolf Hitler",
			content = "I can fight only for something that I love, love only what I respect, and respect only what I at least know.";

			System.out.println(cs7.processComment(new Comment()));	
			System.out.println(cs7.processComment(new Comment(author, content)));	
		} catch(BeansException e) {
			System.out.println("\nException -> " + e.toString() + "\n");
		}
	}
}