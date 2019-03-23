package com.annie.hystric;


import com.annie.service.FeignClientService;
import org.springframework.stereotype.Component;

@Component
public class ErrorFunction implements FeignClientService {


    @Override
    public String getName(String name) {
        return "sorry," + name + ".本次调用服务失败";
    }
}
