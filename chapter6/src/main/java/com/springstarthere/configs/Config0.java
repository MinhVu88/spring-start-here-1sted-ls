package com.springstarthere.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springstarthere.services.CommentService0;

@Configuration
public class Config0 {
	@Bean
	public CommentService0 commentService0() {
		return new CommentService0();
	}
}
