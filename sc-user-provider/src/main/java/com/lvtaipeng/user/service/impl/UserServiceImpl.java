package com.lvtaipeng.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvtaipeng.entity.User;
import com.lvtaipeng.user.mapper.UserMapper;
import com.lvtaipeng.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiatiepeng
 * @since 2020-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
