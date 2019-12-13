package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerInternalTreat;

public interface CancerInternalTreatMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CancerInternalTreat record);

    int insertSelective(CancerInternalTreat record);

    CancerInternalTreat selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CancerInternalTreat record);

    int updateByPrimaryKey(CancerInternalTreat record);
}