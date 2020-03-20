package yong.hui.dao;

import yong.hui.pojo.Consumer;

public interface ConsumerMapper {
    int insert(Consumer record);

    int insertSelective(Consumer record);
}