package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SPRING_WEB)
                        .apiInfo(apiInfo())
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("com.apis"))
                        .paths(PathSelectors.any())
                        .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                        .title("CCClog RestfulApis")
                        .description("CCCLog")
                        .contact(new Contact("application.yaml", null, null))
                        .version("版本号:" +"0.1")
                        .build();
    }
}
