package com.lizxing.shirodemo.service.impl;

import com.lizxing.shirodemo.entity.Role;
import com.lizxing.shirodemo.mapper.RoleMapper;
import com.lizxing.shirodemo.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
