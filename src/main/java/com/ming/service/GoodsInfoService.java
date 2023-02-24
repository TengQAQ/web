package com.ming.service;

import com.ming.Dto.PageDto;
import com.ming.entity.DeliveryAddr;
import com.ming.entity.GoodsInfo;
import com.ming.vo.Result;

import java.util.List;

public interface GoodsInfoService {
	Result deleteByPrimaryKey(Long id);

	Result insert(GoodsInfo record);

	Result insertSelective(GoodsInfo record);

	Result selectByPrimaryKey(Long id);

	Result updateByPrimaryKeySelective(GoodsInfo record);

	Result updateByPrimaryKey(GoodsInfo record);

	Result selectAll(PageDto dto);

}
