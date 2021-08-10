package com.lizxing.shirodemo.mapper;

import com.lizxing.shirodemo.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lizxing
 * @since 2021-08-09
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    @Select("SELECT p.id,p.url,p.describe  " +
            "FROM " +
            " role r " +
            " LEFT JOIN user_role ur ON ( r.id = ur.role_id ) " +
            " LEFT JOIN user u ON ( u.id = ur.user_id ) " +
            " LEFT JOIN role_permission rp ON ( rp.role_id = r.id ) " +
            " LEFT JOIN permission p ON ( p.id = rp.permission_id )  " +
            "WHERE " +
            " u.username = #{username}")
    List<Permission> selectByUsername(String username);

}
