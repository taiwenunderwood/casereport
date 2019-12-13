package com.uscilims.system.dao;

import com.uscilims.election.dao.ClinicalCaseMapper;
import com.uscilims.election.entity.ClinicalCase;
import com.uscilims.election.service.ClinicalCaseService;
import com.uscilims.system.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.uscilims")
class SysUserMapperTest {


    @Autowired
    SysUserMapper sysUserMapper;
    @Resource(name = "clinicalCaseServiceImpl")
    ClinicalCaseService clinicalCaseService;
    @Autowired
    ClinicalCaseMapper clinicalCaseMapper;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void checkInfo() {
//        SysUser sysUser = sysUserMapper.checkInfo("1","1");
//        System.out.println(sysUser.getId());
        List<ClinicalCase> clinicalCaseList =clinicalCaseService.selectAll();
        System.out.println(clinicalCaseList.size());

    }

}