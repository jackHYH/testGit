package yong.hui.dao;

import yong.hui.pojo.Provider;

public interface ProviderMapper {
    int insert(Provider record);

    int insertSelective(Provider record);
}