package yong.hui.dao;

import yong.hui.pojo.Mdm;

public interface MdmMapper {
    int deleteByPrimaryKey(Integer linenum);

    int insert(Mdm record);

    int insertSelective(Mdm record);

    Mdm selectByPrimaryKey(Integer linenum);

    int updateByPrimaryKeySelective(Mdm record);

    int updateByPrimaryKey(Mdm record);
}