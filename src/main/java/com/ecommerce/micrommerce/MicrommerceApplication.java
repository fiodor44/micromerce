package com.ecommerce.micrommerce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@EnableSwagger2
public class MicrommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrommerceApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application.version}") String version) {
		return new OpenAPI().info(
				new Info()
						.title("Micrommerce")
						.description("Api Test de la formation OpenClassroom")
						.version(version)
						.contact(
								new Contact().name("JPLG").email("jean-philippe.leguillou@systeme-u.fr")
						)
		);
	}
}
