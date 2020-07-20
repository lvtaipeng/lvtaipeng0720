package com.lvtaipeng.user;

import com.lvtaipeng.entity.User;
import com.lvtaipeng.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("getuser")
    public String getUserNameById(@RequestParam(value = "uid",defaultValue = "1")int id){
        return  "第一个服务111username="+id;
    }
    @RequestMapping("testList")
    public List<String> gets(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Eason");
        list.add("陈奕迅");
        return list;
    }
    @RequestMapping("listuser")
    public List<User> userlist(){
        return userService.list();
    }

}
