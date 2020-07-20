package com.jtp.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("getuser")
    public String getUserNameById(@RequestParam(value = "uid",defaultValue = "1")int id){
        return  "第二个服务2222username="+id;
    }
    @RequestMapping(value = "testList")
    public List<String> gets(){

        ArrayList<String> list = new ArrayList<>();
        list.add("jay");
        list.add("周杰伦");
        return list;

    }

}
