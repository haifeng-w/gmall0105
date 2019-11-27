package com.king.gmall.service;

import com.king.gmall.beans.UmsMember;
import com.king.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

/**
 * Created by Administrator on 2019/11/26.
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
