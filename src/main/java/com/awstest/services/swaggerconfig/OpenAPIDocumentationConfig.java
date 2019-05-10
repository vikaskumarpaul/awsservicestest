package com.awstest.services.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class OpenAPIDocumentationConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.awstest.services"))
				.paths(PathSelectors.ant("/awstest/*")).build();
	}
	/*
	 * ApiInfo apiInfo() { return new ApiInfoBuilder().title("AwsServicesTest")
	 * .description("This APi test or implements diffrent AWS services").license(
	 * "AwsServices")
	 * .licenseUrl("http://unlicense.org").termsOfServiceUrl("").version("1.0.0")
	 * .contact(new Contact("", "", "er.vikaspaul@gmail.com")).build(); }
	 * 
	 * @Bean public Docket customImplementation(ServletContext servletContext,
	 * 
	 * @Value("${openapi.awsServicesTest.base-path:/}") String basePath) { return
	 * new Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.awstest.services")) .paths(new
	 * Predicate<String>() {
	 * 
	 * @Override public boolean apply(@Nullable String input) { return true; } })
	 * .build() .pathProvider(new BasePathAwareRelativePathProvider(servletContext,
	 * basePath)) .directModelSubstitute(java.time.LocalDate.class,
	 * java.sql.Date.class) .directModelSubstitute(java.time.OffsetDateTime.class,
	 * java.util.Date.class).apiInfo(apiInfo()); }
	 * 
	 * class BasePathAwareRelativePathProvider extends RelativePathProvider {
	 * private String basePath;
	 * 
	 * public BasePathAwareRelativePathProvider(ServletContext servletContext,
	 * String basePath) { super(servletContext); this.basePath = basePath; }
	 * 
	 * @Override protected String applicationPath() { return
	 * Paths.removeAdjacentForwardSlashes(
	 * UriComponentsBuilder.fromPath(super.applicationPath()).path(basePath).build()
	 * .toString()); }
	 * 
	 * @Override public String getOperationPath(String operationPath) {
	 * UriComponentsBuilder uriComponentsBuilder =
	 * UriComponentsBuilder.fromPath("/"); return
	 * Paths.removeAdjacentForwardSlashes(
	 * uriComponentsBuilder.path(operationPath.replaceFirst("^" + basePath,
	 * "")).build().toString()); } }
	 */
	
	
	
	/*
	 * @Bean public Docket api() { return new Docket(DocumentationType.SWAGGER_2)//
	 * .select()// .apis(RequestHandlerSelectors.any())//
	 * .paths(Predicates.not(PathSelectors.regex("/error")))// .build()//
	 * .apiInfo(metadata())// .useDefaultResponseMessages(false)//
	 * .securitySchemes(new ArrayList<>(Arrays.asList(new ApiKey("Bearer %token",
	 * "Authorization", "Header"))))// .tags(new Tag("users",
	 * "Operations about users"))// .tags(new Tag("ping", "Just a ping"))//
	 * .genericModelSubstitutes(Optional.class);
	 * 
	 * }
	 * 
	 * private ApiInfo metadata() { return new ApiInfoBuilder()//
	 * .title("JSON Web Token Authentication API")// .description(
	 * "This is a sample JWT authentication service. You can find out more about JWT at [https://jwt.io/](https://jwt.io/). For this sample, you can use the `admin` or `client` users (password: admin and client respectively) to test the authorization filters. Once you have successfully logged in and obtained the token, you should click on the right top button `Authorize` and introduce it with the prefix \"Bearer \"."
	 * )// .version("1.0.0")//
	 * .license("MIT License").licenseUrl("http://opensource.org/licenses/MIT")//
	 * .contact(new Contact(null, null, "mauriurraco@gmail.com"))// .build(); }
	 */

}
