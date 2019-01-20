package com.lbh.eurekafeign.service;

import com.lbh.eurekafeign.service.implservice.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * 注： 启用断路器 只需要在 @FeignClient()注解中加上 fallback 属性就可以了，SchedualServiceHiHystric 实现改接口。
 * Created by Advancer on 2019/1/17 10:46.
 * auth: lbh
 */
@Component
@FeignClient(value = "eureka-client", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
