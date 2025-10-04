package com.manning.springstarthere;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.manning.springstarthere.services.CommentService0;
import com.manning.springstarthere.services.CommentService5;

@Configuration
@ComponentScan(basePackages = {
	"com.manning.springstarthere.services",
	"com.manning.springstarthere.repositories",
	"com.manning.springstarthere.processors"
})
public class Config {
	@Bean
	public CommentService0 commentService0() {
		return new CommentService0();
	}

	@Bean
	@Scope("prototype")
	public CommentService5 commentService5() {
		return new CommentService5();
	}
}
