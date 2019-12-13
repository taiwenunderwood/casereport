package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerImageCheck;

public interface CancerImageCheckMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CancerImageCheck record);

    int insertSelective(CancerImageCheck record);

    CancerImageCheck selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CancerImageCheck record);

    int updateByPrimaryKey(CancerImageCheck record);
}