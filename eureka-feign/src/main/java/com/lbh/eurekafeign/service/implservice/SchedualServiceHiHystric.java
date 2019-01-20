package com.lbh.eurekafeign.service.implservice;

import com.lbh.eurekafeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Advancer on 2019/1/18 10:48.
 * auth: lbh
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }

}
