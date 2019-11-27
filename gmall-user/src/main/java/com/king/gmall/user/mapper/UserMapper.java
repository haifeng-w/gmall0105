package com.king.gmall.user.mapper;

import com.king.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2019/11/26.
 */
@Mapper
public interface UserMapper{
    @Select("SELECT * FROM ums_member")
    List<UmsMember> selectAllUser();
}
