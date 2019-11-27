package com.king.gmall.user.controller;

import com.king.gmall.user.bean.UmsMember;
import com.king.gmall.user.bean.UmsMemberReceiveAddress;
import com.king.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/11/26.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("getReceiveAddressByMemberId/{id}")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@PathVariable("id") String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
