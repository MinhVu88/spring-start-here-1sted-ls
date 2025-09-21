package com.springstarthere.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.springstarthere.aspects.LoggingAspect;
import com.springstarthere.aspects.SecurityAspect;

@Configuration
@ComponentScan(basePackages = {"com.springstarthere.services"})
@EnableAspectJAutoProxy
public class Config1 {
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}

	@Bean
	public SecurityAspect securityAspect() {
		return new SecurityAspect();
	}
}
