package com.lvtaipeng.consumer;

import com.lvtaipeng.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;



    @Autowired
    private UserService userService;

   /* @RequestMapping("getname")
    public String getOrderById(@RequestParam("id") Integer id){
        return restTemplate.getForObject("http://sc-user-service/getuser?uid="+id,String.class);
    }*/
    @RequestMapping("getname")
    public String getOrderById(@RequestParam("id") Integer id){
      return userService.getUsernameById(id);
    }

    /**
     * 使用feign 方式
     * @return
     */
    @RequestMapping("mylistf")
    public List<String> list(){
        //sc-user-service:8101
        List<String> testlist = userService.testlist();
        System.out.println("name is " + testlist);
        return  testlist;

    }

    @RequestMapping("listuser")
    @HystrixCommand(fallbackMethod = "getuser")
    public List<User> listuser(){
        //sc-user-service:8101
       // int i=1/0;
        List<User> listuser = userService.listuser();
        System.out.println("listuser is " + listuser);
        return  listuser;

    }

    public List<User> getuser(){
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("出错了");
        users.add(user);
        return users;
    }

}
