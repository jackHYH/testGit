package yong.hui.dao;

import yong.hui.pojo.TConsumer;

public interface TConsumerMapper {
    int insert(TConsumer record);

    int insertSelective(TConsumer record);
}