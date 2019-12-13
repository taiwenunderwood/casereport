package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerOperationTreat;

public interface CancerOperationTreatMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CancerOperationTreat record);

    int insertSelective(CancerOperationTreat record);

    CancerOperationTreat selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CancerOperationTreat record);

    int updateByPrimaryKey(CancerOperationTreat record);
}