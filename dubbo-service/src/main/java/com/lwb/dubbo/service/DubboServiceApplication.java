package com.lwb.dubbo.service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * dubbo服务启动类
 *
 * @author liuweibo
 * @date 2018/12/15
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lwb.**.dao")
@DubboComponentScan
public class DubboServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboServiceApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);
    }
}
