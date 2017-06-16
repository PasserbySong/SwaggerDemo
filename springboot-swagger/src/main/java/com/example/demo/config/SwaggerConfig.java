package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
@Profile("dev")
public class SwaggerConfig {
    @Bean
    public Docket Api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
              /*  .paths(or(regex("/customClassify.*"),regex("/goodsInfo.*//*.*"),regex("/productInfo.*//*.*"),regex("/orderCart.*"),regex("/orderInfo.*"),
                        regex("/goodlabel.*"),regex("/goodlabel.*"),regex("/purchaseinfo.*"),regex("/purchaseproduct.*"),regex("/purchaseQuote.*"),
                        regex("/main.*"),regex("/factoryshow.*"),regex("/homepage.*")))//过滤的接口*/
                .build()
                .apiInfo(ApiInfo());
    }
    private ApiInfo ApiInfo() {
        ApiInfo apiInfo = new ApiInfo("测试演示效果项目",//大标题
                "测试演示",//小标题
                "1.0",//版本
                "tougu terms of service",
                "谢劲松",//作者
                "网站链接",//链接显示文字
                "www.baodu.com"//网站链接
        );
        return apiInfo;
    }
}