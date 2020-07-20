package com.lvtaipeng.consumer.service.impl;

import com.lvtaipeng.consumer.UserService;
import com.lvtaipeng.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceFaileBack implements UserService {
    @Override
    public String getUsernameById(Integer id) {
        return "没有得到["+id+"]的用户";
    }

    @Override
    public List<String> testlist() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Eason");
        list.add("不唱歌了");
        return list;
    }

    @Override
    public List<User> listuser() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("没查到");
        users.add(user);
        return users;
    }
}
