package com.glutton.cms.mapping;

import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.RowBoundsMapper;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeySelectiveMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @Author: lijun_isf
 */

public interface IBaseTableMapping<T> extends BaseSelectMapper<T>, InsertSelectiveMapper<T>, UpdateByPrimaryKeySelectiveMapper<T>, BaseDeleteMapper<T>, ExampleMapper<T>, RowBoundsMapper<T>, InsertListMapper<T>, Marker {
}
