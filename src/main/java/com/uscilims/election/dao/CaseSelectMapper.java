package com.uscilims.election.dao;

import com.uscilims.election.entity.CaseSelect;

public interface CaseSelectMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(CaseSelect record);

    int insertSelective(CaseSelect record);

    CaseSelect selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(CaseSelect record);

    int updateByPrimaryKey(CaseSelect record);
}