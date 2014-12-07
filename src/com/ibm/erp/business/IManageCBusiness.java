package com.ibm.erp.business;

import java.util.List;

import com.ibm.manageC.value.Managechargemanagement;
import com.ibm.manageC.value.Managehome;
import com.ibm.manageC.value.Manageowners;
import com.ibm.manageC.value.Managepark;
import com.ibm.manageC.value.Manageparkmanage;
import com.ibm.manageC.value.Manageuser;
import com.ibm.manageC.value.statisticsowner;
import com.ibm.manageC.value.statisticspark;

public interface IManageCBusiness {
	//显示页数
	public int getshowManagechargemanagementTotalPageNum(int rows) throws Exception;
	public int getshowManagehomeTotalPageNum(int rows) throws Exception;
	public int getshowManageownersTotalPageNum(int rows) throws Exception;
	public int getshowManageparkTotalPageNum(int rows) throws Exception;
	public int getshowManageparkmanageTotalPageNum(int rows) throws Exception;
	public int getshowManageuserTotalPageNum(int rows) throws Exception;
	public int getshowstatisticsownerTotalPageNum(int rows) throws Exception;
	public int getshowstatisticsparkTotalPageNum(int rows) throws Exception;
	
	 //显示管理物业收费标准
	public List<Managechargemanagement> showManagechargemanagement(int rows, int pageNo) throws Exception;
	//增加管理物业收费标准
	public void addManagechargemanagement(Managechargemanagement mo) throws Exception;
	//删除管理物业收费标准
	public void deleteManagechargemanagement(String name) throws Exception;
	//更新管理物业收费标准
	public void updateManagechargemanagement(Managechargemanagement mo) throws Exception;
	
	
	//显示管理房屋信息
	public List<Managehome> showManagehome(int rows, int pageNo) throws Exception;
	//增加管理房屋信息
	public void addManagehome(Managehome mo) throws Exception;
	//删除管理房屋信息
	public void deleteManagehome(String name) throws Exception;
	//更新管理房屋信息
	public void updateManagehome(Managehome mo) throws Exception;
	
	//显示管理用户
	public List<Manageowners> showManageowners(int rows, int pageNo) throws Exception;
	//增加管理用户
	public void addManageowners(Manageowners mo) throws Exception;
	//删除管理用户
	public void deleteManageowners(String name) throws Exception;
	//更新管理用户
	public void updateManageowners(Manageowners mo) throws Exception;
	
	//显示管理停车位
	public List<Managepark> showManagepark(int rows, int pageNo) throws Exception;
	//增加管理停车位
	public void addManagepark(Managepark mo) throws Exception;
	//删除管理停车位
	public void deleteManagepark(String name) throws Exception;
	//更新管理停车位
	public void updateManagepark(Managepark mo) throws Exception;
	
	//显示管理停车位收费标准
	public List<Manageparkmanage> showManageparkmanage(int rows, int pageNo) throws Exception;
	//增加管理停车位收费标准
	public void addManageparkmanage(Manageparkmanage mo) throws Exception;
	//删除管理停车位收费标准
	public void deleteManageparkmanage(String name) throws Exception;
	//更新管理停车位收费标准
	public void updateManageparkmanage(Manageparkmanage mo) throws Exception;
	
	//显示管理用户
	public List<Manageuser> showManageuser(int rows, int pageNo) throws Exception;
	//增加管理用户
	public void addManageuser(Manageuser mo) throws Exception;
	//删除管理用户
	public void deleteManageuser(String name) throws Exception;
	//更新管理用户
	public void updateManageuser(Manageuser mo) throws Exception;
	
	//显示统计物业费缴纳情况
	public List<statisticsowner> showstatisticsowner(int rows, int pageNo) throws Exception;
	//增加统计物业费缴纳情况
	public void addstatisticsowner(statisticsowner mo) throws Exception;
	//删除统计物业费缴纳情况
	public void deletestatisticsowner(String name) throws Exception;
	//更新统计物业费缴纳情况
	public void updatestatisticsowner(statisticsowner mo) throws Exception;
	
	//显示统计停车费缴费情况
	public List<statisticspark> showstatisticspark(int rows, int pageNo) throws Exception;
	//增加统计停车费缴费情况
	public void addstatisticspark(statisticspark mo) throws Exception;
	//删除统计停车费缴费情况
	public void deletestatisticspark(String name) throws Exception;
	//更新统计停车费缴费情况
	public void updatestatisticspark(statisticspark mo) throws Exception;
	

}
