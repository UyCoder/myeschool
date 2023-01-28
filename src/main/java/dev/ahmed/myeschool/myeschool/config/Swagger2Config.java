package dev.ahmed.myeschool.myeschool.config;


import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Ahmed Bughra
 * @create 2023-01-23  9:12 PM
 * Swagger2 config information
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket webApiConfig(){

        //Add head parameter start
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder tokenPar = new ParameterBuilder();
        tokenPar.name("userId")
                .description("User ID")
                .defaultValue("1")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        pars.add(tokenPar.build());

        ParameterBuilder tmpPar = new ParameterBuilder();
        tmpPar.name("userTempId")
                .description("User Temp ID")
                .defaultValue("1")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        pars.add(tmpPar.build());
        //Add head parameter end

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                //You can test the request header: enter token
//                .apis(RequestHandlerSelectors.withClassAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("dev.ahmed.myeschool.myeschool.controller"))
                //Filter out all pages under the admin path
                //.paths(Predicates.and(PathSelectors.regex("/sms/.*")))
                //Filter out all error or error.* pages
                //.paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .globalOperationParameters(pars);

    }



    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("Website - API Documentation")
                .description("This document describes the website microservice interface definition")
                .version("1.0")
                .contact(new Contact("Ahmed", "https://www.linkedin.com/in/ahmed-bughra/", "ahmedbughra@gmail.com"))
                .build();
    }

    private ApiInfo adminApiInfo(){

        return new ApiInfoBuilder()
                .title("Backend Management System-API Documentation")
                .description("This document describes the microservice interface definition of the background management system")
                .version("1.0")
                .contact(new Contact("Ahmed", "https://www.linkedin.com/in/ahmed-bughra/", "ahmedbughra@gmail.com"))
                .build();
    }


}

