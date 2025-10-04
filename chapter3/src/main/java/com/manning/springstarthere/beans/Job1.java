package com.manning.springstarthere.beans;

import org.springframework.stereotype.Component;

@Component
public class Job1 {
	private String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
}
