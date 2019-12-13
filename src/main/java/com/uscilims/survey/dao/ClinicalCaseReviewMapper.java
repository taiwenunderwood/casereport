package com.uscilims.survey.dao;

import com.uscilims.survey.entity.ClinicalCaseReview;

public interface ClinicalCaseReviewMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(ClinicalCaseReview record);

    int insertSelective(ClinicalCaseReview record);

    ClinicalCaseReview selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(ClinicalCaseReview record);

    int updateByPrimaryKey(ClinicalCaseReview record);
}