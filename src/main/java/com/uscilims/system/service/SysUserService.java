package com.uscilims.system.service;

import com.uscilims.system.entity.SysUser;
import org.springframework.stereotype.Service;

@Service
public interface SysUserService {
    SysUser loginValidate(String userName, String passWord);
}
