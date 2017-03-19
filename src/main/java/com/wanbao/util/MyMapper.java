package com.wanbao.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wanbao on 2017/3/19.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
