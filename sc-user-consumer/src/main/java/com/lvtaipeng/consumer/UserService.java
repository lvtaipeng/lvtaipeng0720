package com.lvtaipeng.consumer;

import com.lvtaipeng.consumer.service.impl.UserServiceFaileBack;
import com.lvtaipeng.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Repository
@FeignClient(name = "sc-user-service",fallback = UserServiceFaileBack.class)
public interface UserService {

    @RequestMapping("/getuser")
    public String getUsernameById(@RequestParam("uid") Integer id);

    @RequestMapping("/testList")
    List<String> testlist();

    @RequestMapping("/listuser")
    List<User> listuser();
}
