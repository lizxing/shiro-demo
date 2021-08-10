package com.lizxing.shirodemo.service.impl;

import com.lizxing.shirodemo.entity.User;
import com.lizxing.shirodemo.mapper.UserMapper;
import com.lizxing.shirodemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lizxing
 * @since 2021-08-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
