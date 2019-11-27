package com.king.gmall.user.mapper;

import com.king.gmall.beans.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2019/11/27.
 */
@Mapper
public interface UmsMemberReceiveAddressMapper {
    @Select("select * from ums_member_receive_address where member_id=#{id}")
    List<UmsMemberReceiveAddress> selectReceiveAddressByMemberId(String memberId);
}
