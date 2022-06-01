package com.example.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

	@Bean
	public Docket swaggerCustmization(){
		//return docket instace at the last
		return  new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths( PathSelectors.ant("/api/*"))
				.apis( RequestHandlerSelectors.basePackage("com.example.swagger") )
				.build()
				.apiInfo(apiInfo());
	}
	private ApiInfo apiInfo(){
	return new ApiInfo(
			"Address Book Info",
			"Api created by Pushkar Bisht",
			"1.0",
			"Free to use",
			new springfox.documentation.service.Contact("Pushkar","https://swageer.io","pushkar@gmail.com"),
			"Api License",
			"https://swageer.io",
			Collections.emptyList());
	}
}
