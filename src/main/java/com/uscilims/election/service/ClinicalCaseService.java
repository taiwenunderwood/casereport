package com.uscilims.election.service;

import com.uscilims.election.entity.ClinicalCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClinicalCaseService {
    public List<ClinicalCase> selectAll();

    List<ClinicalCase> selectByPage(Integer page, Integer limit);

    int selectCount();
}
