package com.studentcrud.configuration;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
@Configuration
@EnableSwagger2
@EnableWebMvc
public class configure implements WebMvcConfigurer {
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
//	    @Bean
//	    public ObjectMapper createObjectMapper() {
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        SimpleModule s = new SimpleModule();
//	        objectMapper.registerModule(s);
//	        objectMapper.setTimeZone(TimeZone.getDefault());
//	        objectMapper.registerModule(new JodaModule()).disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
//	        objectMapper.configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false);
//	        return objectMapper;
//	    }


}
