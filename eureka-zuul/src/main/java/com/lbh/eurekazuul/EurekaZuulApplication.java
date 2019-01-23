package com.lbh.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy   // 开启zuul功能
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
        System.out.println("==============eureka-zuul 启动成功=================");
    }

}

