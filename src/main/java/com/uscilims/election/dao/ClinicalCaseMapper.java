package com.uscilims.election.dao;

import com.uscilims.election.entity.ClinicalCase;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface ClinicalCaseMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(ClinicalCase record);

    int insertSelective(ClinicalCase record);

    ClinicalCase selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(ClinicalCase record);

    int updateByPrimaryKey(ClinicalCase record);

    List<ClinicalCase> selectAll();

    List<ClinicalCase> selectByPage(Integer start, Integer limit);

    int selectCount();
}