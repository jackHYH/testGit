package yong.hui.dao;

import yong.hui.pojo.DoMainObject;

public interface DoMainObjectMapper {
    int insert(DoMainObject record);

    int insertSelective(DoMainObject record);
}