package com.ems;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class SpringDocConfig implements WebMvcConfigurer
{


	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins(
	                        "https://aware-empathy-production.up.railway.app",
	                        "https://localhost:8080",
	                        "https://aware-empathy-production.up.railway.app/swagger-ui/index.html"
	                )
	                .allowedMethods("GET", "POST", "PUT", "DELETE")
	                .allowedHeaders("*")
	                ;
	    }
}