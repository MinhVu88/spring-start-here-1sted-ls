package com.springstarthere;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
  "com.springstarthere.services",
  "com.springstarthere.repositories",
  "com.springstarthere.proxies"
})
public class Config {}
