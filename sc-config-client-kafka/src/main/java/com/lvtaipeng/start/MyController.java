package com.lvtaipeng.start;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {
    @Value("${mykey}")
    private  String value;

    @RequestMapping("list")
    public String getVal(){
        return "the value is :"+value;
    }
}
