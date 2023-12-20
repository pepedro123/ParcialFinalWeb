package com.example.ParcialFinalWeb;

import io.swagger.v3.oas.annotations.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                ;
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Encrypta Service API",
                "Corresponde al API de los servicios de Encrypta",
                "1.0",
                "https://www.encrypta.com.mx/terms",
                new Contact("Encrypta", "https://www.encrypta.com.mx", "apis@encrypta.com.mx"),
                "LICENSE",
                "LICENSE URL",
                new ArrayList<VendorExtension>()
        );
    }
}