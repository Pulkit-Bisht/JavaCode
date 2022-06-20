package com.myproject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Collections;
@Configuration
@EnableWebMvc

public class SwaggerConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry
                .addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


    @Bean
    public Docket api() {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder.name("Authorization").modelRef(new ModelRef("string")).parameterType("header").required(false)
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .securitySchemes(Collections.singletonList(
                        new ApiKey("Authorization", HttpHeaders.AUTHORIZATION,
                                ApiKeyVehicle.HEADER.name())
                ))
                .securityContexts(Collections.singletonList(SecurityContext.builder()
                        .securityReferences(Collections.singletonList(SecurityReference.builder()
                                .reference("Authorization")
                                .scopes(new AuthorizationScope[0])
                                .build())).build())).select()
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }
    public ApiInfo apiInfo() {
        final ApiInfoBuilder builder = new ApiInfoBuilder();
        builder.title("Rainrock  API").version("1.0")
                .license("(C) Copyright Baitsanape IT Company (Pty) Ltd.").description(
                        "The API provides a platform to query build Rainrock api").contact(
                        new Contact("developer@rainrock.co.za", "http://localhost:8080/swagger-ui.html#",
                                "developer@rainrock.co.za"));
        return builder.build();
    }
}
