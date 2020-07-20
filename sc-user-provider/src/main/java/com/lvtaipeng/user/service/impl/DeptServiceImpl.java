package com.lvtaipeng.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvtaipeng.entity.Dept;
import com.lvtaipeng.user.mapper.DeptMapper;
import com.lvtaipeng.user.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
