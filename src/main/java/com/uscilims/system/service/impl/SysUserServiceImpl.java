package com.uscilims.system.service.impl;

import com.uscilims.system.dao.SysUserMapper;
import com.uscilims.system.entity.SysUser;
import com.uscilims.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;
    
    @Override
    public SysUser loginValidate(String userName, String passWord) {
        return sysUserMapper.checkInfo(userName, passWord);
    }
}
