package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;


@SpringBootApplication
@MapperScan("com.**.mapper")
@EnableSwagger2
public class CCClogApplication extends SpringBootServletInitializer {


	public static void main(String [] args){
		SpringApplication.run(CCClogApplication.class);
	}



	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}

