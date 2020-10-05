package com.stock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//DONE Declare as a configuration class
//DONE Add the annotation to enable Spring MVC
//DONE Add the annotation to specify auto-scan of com.stock
@Configuration
@EnableWebMvc
@ComponentScan("com.stock")
public class WebConfig {
}
