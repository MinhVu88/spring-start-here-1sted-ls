package com.springstarthere;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springstarthere.services.CommentService0;
import com.springstarthere.services.CommentService5;

@Configuration
@ComponentScan(basePackages = {
	"com.springstarthere.services",
	"com.springstarthere.repositories",
	"com.springstarthere.processors"
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
