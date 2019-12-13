package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerTargetLesionCheck;

public interface CancerTargetLesionCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CancerTargetLesionCheck record);

    int insertSelective(CancerTargetLesionCheck record);

    CancerTargetLesionCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CancerTargetLesionCheck record);

    int updateByPrimaryKey(CancerTargetLesionCheck record);
}