package com.lizxing.shirodemo.service.impl;

import com.lizxing.shirodemo.entity.Permission;
import com.lizxing.shirodemo.mapper.PermissionMapper;
import com.lizxing.shirodemo.service.IPermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
