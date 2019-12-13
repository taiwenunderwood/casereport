package com.uscilims.election.service.impl;

import com.uscilims.election.dao.ClinicalCaseMapper;
import com.uscilims.election.entity.ClinicalCase;
import com.uscilims.election.service.ClinicalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicalCaseServiceImpl implements ClinicalCaseService {
    @Autowired
    ClinicalCaseMapper clinicalCaseMapper;

    @Override
    public List<ClinicalCase> selectAll() {
        return clinicalCaseMapper.selectAll();
    }

    @Override
    public List<ClinicalCase> selectByPage(Integer page, Integer limit) {
        Integer start = limit*(page-1);
        return clinicalCaseMapper.selectByPage(start,limit);
    }

    @Override
    public int selectCount() {
        return clinicalCaseMapper.selectCount();
    }
}
