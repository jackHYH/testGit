package yong.hui.dao;

import yong.hui.pojo.DoMain;

public interface DoMainMapper {
    int deleteByPrimaryKey(Integer domainId);

    int insert(DoMain record);

    int insertSelective(DoMain record);

    DoMain selectByPrimaryKey(Integer domainId);

    int updateByPrimaryKeySelective(DoMain record);

    int updateByPrimaryKey(DoMain record);
}