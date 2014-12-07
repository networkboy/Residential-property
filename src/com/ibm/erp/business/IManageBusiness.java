package com.ibm.erp.business;

import java.util.List;

import com.ibm.manage.value.ManageValue;

public interface IManageBusiness {
	//显示管理员和级别
	public List<ManageValue> showManage() throws Exception;
	//管理员登陆
	public boolean loginManage(String id,String password) throws Exception;
}
