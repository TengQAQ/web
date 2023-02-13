package com.ming.service.Impl;

import com.ming.entity.DeliveryAddr;
import com.ming.service.DeliveryAddrService;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryAddrServiceImplTest {
	DeliveryAddrService service = new DeliveryAddrServiceImpl();

	@Test
	public void deleteByPrimaryKey() {
	}

	@Test
	public void insert() {
	}

	@Test
	public void insertSelective() {
	}

	@Test
	public void selectByPrimaryKey() {
		DeliveryAddr deliveryAddr = service.selectByPrimaryKey(1L);
		System.out.println(deliveryAddr);
	}

	@Test
	public void updateByPrimaryKeySelective() {
	}

	@Test
	public void updateByPrimaryKey() {
	}
}