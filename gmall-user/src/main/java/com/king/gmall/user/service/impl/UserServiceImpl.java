package com.king.gmall.user.service.impl;

import com.king.gmall.user.bean.UmsMember;
import com.king.gmall.user.bean.UmsMemberReceiveAddress;
import com.king.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.king.gmall.user.mapper.UserMapper;
import com.king.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/11/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.selectReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAllUser();//userMapper.selectAllUser();
        return umsMemberList;
    }
}
