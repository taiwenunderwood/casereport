package com.uscilims.system.dao;

import com.uscilims.system.entity.Experimentcenter;

public interface ExperimentcenterMapper {
    int deleteByPrimaryKey(Integer centerid);

    int insert(Experimentcenter record);

    int insertSelective(Experimentcenter record);

    Experimentcenter selectByPrimaryKey(Integer centerid);

    int updateByPrimaryKeySelective(Experimentcenter record);

    int updateByPrimaryKey(Experimentcenter record);
}