package com.manning.springstarthere;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
  "com.manning.springstarthere.services",
  "com.manning.springstarthere.repositories",
  "com.manning.springstarthere.proxies"
})
public class Config {}
