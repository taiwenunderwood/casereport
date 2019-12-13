package com.uscilims.election.dao;

import com.uscilims.election.entity.ClinicalCasePathology;

public interface ClinicalCasePathologyMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(ClinicalCasePathology record);

    int insertSelective(ClinicalCasePathology record);

    ClinicalCasePathology selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(ClinicalCasePathology record);

    int updateByPrimaryKey(ClinicalCasePathology record);
}