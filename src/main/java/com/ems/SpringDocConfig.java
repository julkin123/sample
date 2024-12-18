package com.ems;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url("https://aware-empathy-production.up.railway.app"))
                .info(new Info().title("API").version("1.0"));
    }
}

//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//public class SpringDocConfig implements WebMvcConfigurer
//{
//
//
//	 @Override
//	    public void addCorsMappings(CorsRegistry registry) {
//	        registry.addMapping("/**")
//	                .allowedOrigins(
//	                        "http://aware-empathy-production.up.railway.app",
//	                        "http://localhost:8080",
//	                        "http://aware-empathy-production.up.railway.app/swagger-ui/index.html"
//	                )
//	                .allowedMethods("GET", "POST", "PUT", "DELETE")
//	                .allowedHeaders("*")
//	                ;
//	    }
//}