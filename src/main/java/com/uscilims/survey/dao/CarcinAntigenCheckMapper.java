package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CarcinAntigenCheck;

public interface CarcinAntigenCheckMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CarcinAntigenCheck record);

    int insertSelective(CarcinAntigenCheck record);

    CarcinAntigenCheck selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CarcinAntigenCheck record);

    int updateByPrimaryKey(CarcinAntigenCheck record);
}