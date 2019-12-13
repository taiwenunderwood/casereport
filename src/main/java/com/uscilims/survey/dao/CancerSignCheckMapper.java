package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerSignCheck;

public interface CancerSignCheckMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CancerSignCheck record);

    int insertSelective(CancerSignCheck record);

    CancerSignCheck selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CancerSignCheck record);

    int updateByPrimaryKey(CancerSignCheck record);
}