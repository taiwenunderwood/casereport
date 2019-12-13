package com.uscilims.election.dao;

import com.uscilims.election.entity.Personbase;

public interface PersonbaseMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Personbase record);

    int insertSelective(Personbase record);

    Personbase selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Personbase record);

    int updateByPrimaryKey(Personbase record);
}