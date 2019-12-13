package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerRadioThreapyTreat;

public interface CancerRadioThreapyTreatMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CancerRadioThreapyTreat record);

    int insertSelective(CancerRadioThreapyTreat record);

    CancerRadioThreapyTreat selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CancerRadioThreapyTreat record);

    int updateByPrimaryKey(CancerRadioThreapyTreat record);
}