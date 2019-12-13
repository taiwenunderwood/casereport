package com.uscilims.survey.dao;

import com.uscilims.survey.entity.CancerTreatRecord;

public interface CancerTreatRecordMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CancerTreatRecord record);

    int insertSelective(CancerTreatRecord record);

    CancerTreatRecord selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CancerTreatRecord record);

    int updateByPrimaryKey(CancerTreatRecord record);
}