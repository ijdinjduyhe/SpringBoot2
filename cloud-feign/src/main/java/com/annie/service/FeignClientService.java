package com.annie.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-client")
public interface FeignClientService {

    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    String getName(@RequestParam(value = "name") String name);

}
