package com.mjj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //重要
@ComponentScan(basePackages = {"com.mjj"})
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                //选择那些接口会生成document
                .select()
                .apis(RequestHandlerSelectors.any())
                //扫描所以api
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo createApiInfo(){
        return new ApiInfoBuilder()
                //标题
                .title("电商网站接口文档")
                //描述
                .description("电商网站接口测试")
                //版本号
                .version("v1.0.0")
                .license("").licenseUrl("").termsOfServiceUrl("")
                .build();
    }
}
