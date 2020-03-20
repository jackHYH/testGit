package yong.hui.dao;

import yong.hui.pojo.TProvider;

public interface TProviderMapper {
    int deleteByPrimaryKey(Integer linenum);

    int insert(TProvider record);

    int insertSelective(TProvider record);

    TProvider selectByPrimaryKey(Integer linenum);

    int updateByPrimaryKeySelective(TProvider record);

    int updateByPrimaryKey(TProvider record);
}