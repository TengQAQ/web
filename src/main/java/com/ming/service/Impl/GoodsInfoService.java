package com.ming.service.Impl;

import com.ming.entity.GoodsInfo;
import com.ming.service.BaseService;
import com.ming.vo.Result;

public interface GoodsInfoService extends BaseService<Long, GoodsInfo> {
	Result SelectAllGoodsInfo();
}
