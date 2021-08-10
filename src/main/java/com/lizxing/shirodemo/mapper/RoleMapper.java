package com.lizxing.shirodemo.mapper;

import com.lizxing.shirodemo.entity.Role;
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
public interface RoleMapper extends BaseMapper<Role> {

    @Select("SELECT " +
            " r.id,r.NAME,r.describe  " +
            "FROM " +
            " role r " +
            " LEFT JOIN user_role ur ON ( r.id = ur.role_id ) " +
            " LEFT JOIN user u ON ( u.id = ur.user_id )  " +
            "WHERE " +
            " u.username = #{username}")
    List<Role> selectByUsername(String username);

}
