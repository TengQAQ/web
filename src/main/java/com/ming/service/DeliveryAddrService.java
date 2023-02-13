package com.ming.service;

import com.ming.entity.DeliveryAddr;

public interface DeliveryAddrService extends BaseService<Long, DeliveryAddr>{
	@Override
	Long deleteByPrimaryKey(Long id);

	@Override
	Long insert(DeliveryAddr record);

	@Override
	Long insertSelective(DeliveryAddr record);

	@Override
	DeliveryAddr selectByPrimaryKey(Long id);

	@Override
	Long updateByPrimaryKeySelective(DeliveryAddr record);

	@Override
	Long updateByPrimaryKey(DeliveryAddr record);
}
