package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	

	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cgi.jeanstationuseraccounts"))
				.build()
				.apiInfo(getDetails());
	}

	public ApiInfo getDetails() {
		ApiInfoBuilder apibuild = new ApiInfoBuilder();
		apibuild.title("useraccount-app").version("0.0.1")
		.description(" uses MYSQL db. rest api")
		.license("teamjeansstation@CGI");
		return apibuild.build();

	}

}