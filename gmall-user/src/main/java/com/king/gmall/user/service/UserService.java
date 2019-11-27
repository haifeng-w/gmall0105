package com.king.gmall.user.service;

import com.king.gmall.user.bean.UmsMember;
import com.king.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * Created by Administrator on 2019/11/26.
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
