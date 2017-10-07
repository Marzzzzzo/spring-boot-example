package com.k2data.k2app.quality;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by WAYNE.WJ.CHEN on 2017/1/4.
 * Visit API Doc page
 * - http://host:8070/k2app-qms/swagger-ui.html
 * Reference:
 * - http://www.cnblogs.com/xiaohanghang/p/6018654.html
 * - http://blog.csdn.net/u014351782/article/details/52943717
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.k2data.k2app.qms.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("QUALITY API Doc")
//                .description("更多Spring Boot相關文章請關注：http://blog.didispace.com/")
//                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("K2Data Electronics")
                .version("1.0")
                .build();
    }
}