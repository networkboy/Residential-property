package com.ibm.erp.business;

import java.util.List;

import com.ibm.manageA.value.Manageowner;
import com.ibm.manageA.value.Manageservice;

public interface IManageABusiness {
	//显示页数
	public int getshowManageownerTotalPageNum(int rows) throws Exception;
	public int getshowManageserviceTotalPageNum(int rows) throws Exception;
	//显示管理业主缴纳物业管理费信息
	public List<Manageowner> showManageowner(int rows, int pageNo) throws Exception;
	//增加管理业主缴纳物业管理费信息
	public void addManageowner(Manageowner mo) throws Exception;
	//删除管理业主缴纳物业管理费信息
	public void deleteManageowner(String name) throws Exception;
	//更新管理业主缴纳物业管理费信息
	public void updateManageowner(Manageowner mo) throws Exception;
	//显示管理维修信息
	public List<Manageservice> showManageservice(int rows, int pageNo) throws Exception;
	//删除管理维修信息
	public void deleteManageservice(String name) throws Exception;
	//增加管理维修信息
	public void addManageservice(Manageservice mo) throws Exception;
	//更新管理维修信息
	public void updateManageservice(Manageservice mo) throws Exception;
}
