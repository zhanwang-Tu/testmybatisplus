package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface UserMapper extends BaseMapper<User> {
}
    // 根据用户ID查询用户信息
//    @Select("SELECT * FROM t_user WHERE id = #{id}")
//    User selectById(@Param("id") Long id);
//
//    // 查询所有用户信息
//    @Select("SELECT * FROM t_user")
//    List<User> selectAll();
//}
