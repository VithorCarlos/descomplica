package com.scholl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {

  @Bean
  OpenAPI springSchoolOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Api restful com documentação")
            .description("API Restfull para escola, utilizando spring boot")
            .version("1.0.0")
            .license(new License().name("Apache 2.0").url("http://springdoc.org"))
            .contact(new Contact().url("https://github.com/VithorCarlos/descomplica").name("Vithor Carlos")
                .email("vithor@hotmail.com")));
  }
}
