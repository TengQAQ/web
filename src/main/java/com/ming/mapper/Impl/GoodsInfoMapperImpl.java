package com.ming.mapper.Impl;

import com.ming.entity.GoodsInfo;
import com.ming.mapper.GoodsInfoMapper;
import com.ming.utils.SqlSessionHelper;

import java.util.List;

public class GoodsInfoMapperImpl implements GoodsInfoMapper {
	@Override
	public Long deleteByPrimaryKey(Long id) {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).deleteByPrimaryKey(id);
	}

	@Override
	public Long insert(GoodsInfo record) {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).insert(record);
	}

	@Override
	public Long insertSelective(GoodsInfo record) {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).insertSelective(record);
	}

	@Override
	public GoodsInfo selectByPrimaryKey(Long id) {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public Long updateByPrimaryKeySelective(GoodsInfo record) {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).updateByPrimaryKeySelective(record);
	}

	@Override
	public Long updateByPrimaryKey(GoodsInfo record) {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).updateByPrimaryKeySelective(record);
	}

	@Override
	public List<GoodsInfo> SelectAllGoodsInfo() {
		return SqlSessionHelper.opensqlsession().getMapper(GoodsInfoMapper.class).SelectAllGoodsInfo();
	}
}
