package com.ibm.erp.action;
import java.util.List;

import com.ibm.erp.business.IManageCBusiness;
import com.ibm.manageB.value.Manageservicefund;
import com.ibm.manageC.value.Managechargemanagement;
import com.ibm.manageC.value.Managehome;
import com.ibm.manageC.value.Manageowners;
import com.ibm.manageC.value.Managepark;
import com.ibm.manageC.value.Manageparkmanage;
import com.ibm.manageC.value.Manageuser;
import com.ibm.manageC.value.statisticsowner;
import com.ibm.manageC.value.statisticspark;
import com.opensymphony.xwork2.ActionSupport;

public class ManageC extends ActionSupport{
	private int rows=5;
	private int pageNo=1;
	private int totalPageNum=0;
	private String name;
	private String address;
	private String status;
	private String time;
	private List<Managechargemanagement> managechargemanagement;
	private List<Managehome> managehome;
	private List<Manageowners> manageowners;
	private List<Managepark> managepark;
	private List<Manageparkmanage> manageparkmanage;
	private List<Manageuser> manageuser;
	private List<statisticsowner> statisticsowners;
	private List<statisticspark> statisticsparks;
	private IManageCBusiness ib;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public List<Managechargemanagement> getManagechargemanagement() {
		return managechargemanagement;
	}
	public void setManagechargemanagement(
			List<Managechargemanagement> managechargemanagement) {
		this.managechargemanagement = managechargemanagement;
	}
	public List<Managehome> getManagehome() {
		return managehome;
	}
	public void setManagehome(List<Managehome> managehome) {
		this.managehome = managehome;
	}
	public List<Manageowners> getManageowners() {
		return manageowners;
	}
	public void setManageowners(List<Manageowners> manageowners) {
		this.manageowners = manageowners;
	}
	public List<Managepark> getManagepark() {
		return managepark;
	}
	public void setManagepark(List<Managepark> managepark) {
		this.managepark = managepark;
	}
	public List<Manageparkmanage> getManageparkmanage() {
		return manageparkmanage;
	}
	public void setManageparkmanage(List<Manageparkmanage> manageparkmanage) {
		this.manageparkmanage = manageparkmanage;
	}
	public List<Manageuser> getManageuser() {
		return manageuser;
	}
	public void setManageuser(List<Manageuser> manageuser) {
		this.manageuser = manageuser;
	}
	public List<statisticsowner> getStatisticsowners() {
		return statisticsowners;
	}
	public void setStatisticsowners(List<statisticsowner> statisticsowners) {
		this.statisticsowners = statisticsowners;
	}
	public List<statisticspark> getStatisticsparks() {
		return statisticsparks;
	}
	public void setStatisticsparks(List<statisticspark> statisticsparks) {
		this.statisticsparks = statisticsparks;
	}
	public IManageCBusiness getIb() {
		return ib;
	}
	public void setIb(IManageCBusiness ib) {
		this.ib = ib;
	}
	//显示管理物业收费标准
	public String showManagechargemanagement() throws Exception{
		totalPageNum=ib.getshowManagechargemanagementTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		managechargemanagement = ib.showManagechargemanagement(rows, pageNo);
		for(Managechargemanagement o:managechargemanagement){
			System.out.println(""+o.getName());
		}
		return "showManagechargemanagement";	
	}
	//增加管理物业收费标准
	public String addManagechargemanagement() throws Exception{
		Managechargemanagement mo = new Managechargemanagement();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManagechargemanagement(mo);
	    System.out.println("增加"+getName());
		
		return "addManagechargemanagement";	
	}
	//删除管理物业收费标准
	public String deleteManagechargemanagement() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManagechargemanagement(chinaName);
		return "deleteManagechargemanagement";	
	}
	//更新管理物业收费标准
	public String updateManagechargemanagement() throws Exception{
		Managechargemanagement mo = new Managechargemanagement();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManagechargemanagement(mo);
		return "updateManagechargemanagement";	
	}
	//显示管理房屋信息
	public String showManagehome() throws Exception{
		totalPageNum=ib.getshowManagehomeTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		managehome = ib.showManagehome(rows, pageNo);
		for(Managehome o:managehome){
			System.out.println(""+o.getName());
		}
		return "showManagehome";	
	}
	//增加管理房屋信息
	public String addManagehome() throws Exception{
		Managehome mo = new Managehome();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManagehome(mo);
	    System.out.println("增加"+getName());
		
		return "addManagehome";	
	}
	//删除管理房屋信息
	public String deleteManagehome() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManagehome(chinaName);
		return "deleteManagehome";	
	}
	//更新管理房屋信息
	public String updateManagehome() throws Exception{
		Managehome mo = new Managehome();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManagehome(mo);
		return "updateManagehome";	
	}
	//显示管理用户
	public String showManageowners() throws Exception{
		totalPageNum=ib.getshowManageownersTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		manageowners = ib.showManageowners(rows, pageNo);
		for(Manageowners o:manageowners){
			System.out.println(""+o.getName());
		}
		return "showManageowners";	
	}
	//增加管理用户
	public String addManageowners() throws Exception{
		Manageowners mo = new Manageowners();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManageowners(mo);
	    System.out.println("增加"+getName());
		
		return "addManageowners";	
	}
	//删除管理用户
	public String deleteManageowners() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageowners(chinaName);
		return "deleteManageowners";	
	}
	//更新管理用户
	public String updateManageowners() throws Exception{
		Manageowners mo = new Manageowners();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManageowners(mo);
		return "updateManageowners";	
	}
	//显示管理停车位
	public String showManagepark() throws Exception{
		totalPageNum=ib.getshowManageparkTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		managepark = ib.showManagepark(rows, pageNo);
		for(Managepark o:managepark){
			System.out.println(""+o.getName());
		}
		return "showManagepark";	
	}
	//增加管理停车位
	public String addManagepark() throws Exception{
		Managepark mo = new Managepark();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManagepark(mo);
	    System.out.println("增加"+getName());
		
		return "addManagepark";	
	}
	//删除管理停车位
	public String deleteManagepark() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManagepark(chinaName);
		return "deleteManagepark";	
	}
	//更新管理停车位
	public String updateManagepark() throws Exception{
		Managepark mo = new Managepark();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManagepark(mo);
		return "updateManagepark";	
	}
	//显示管理停车位收费标准
	public String showManageparkmanage() throws Exception{
		totalPageNum=ib.getshowManageparkmanageTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		manageparkmanage = ib.showManageparkmanage(rows, pageNo);
		for(Manageparkmanage o:manageparkmanage){
			System.out.println(""+o.getName());
		}
		return "showManageparkmanage";	
	}
	//增加管理停车位收费标准
	public String addManageparkmanage() throws Exception{
		Manageparkmanage mo = new Manageparkmanage();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManageparkmanage(mo);
	    System.out.println("增加"+getName());
		
		return "addManageparkmanage";	
	}
	//删除管理停车位收费标准
	public String deleteManageparkmanage() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageparkmanage(chinaName);
		return "deleteManageparkmanage";	
	}
	//更新管理停车位收费标准
	public String updateManageparkmanage() throws Exception{
		Manageparkmanage mo = new Manageparkmanage();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManageparkmanage(mo);
		return "updateManageparkmanage";	
	}
	//显示管理用户
	public String showManageuser() throws Exception{
		totalPageNum=ib.getshowManageuserTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		manageuser = ib.showManageuser(rows, pageNo);
		for(Manageuser o:manageuser){
			System.out.println(""+o.getName());
		}
		return "showManageuser";	
	}
	//增加管理用户
	public String addManageuser() throws Exception{
		Manageuser mo = new Manageuser();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManageuser(mo);
	    System.out.println("增加"+getName());
		
		return "addManageuser";	
	}
	//删除管理用户
	public String deleteManageuser() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageuser(chinaName);
		return "deleteManageuser";	
	}
	//更新管理用户
	public String updateManageuser() throws Exception{
		Manageuser mo = new Manageuser();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManageuser(mo);
		return "updateManageuser";	
	}
	//显示统计停车费缴费情况
	public String showstatisticsowner() throws Exception{
		totalPageNum=ib.getshowstatisticsownerTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		statisticsowners = ib.showstatisticsowner(rows, pageNo);
		for(statisticsowner o:statisticsowners){
			System.out.println(""+o.getName());
		}
		return "showstatisticsowner";	
	}
	//增加统计停车费缴费情况
	public String addstatisticsowner() throws Exception{
		statisticsowner mo = new statisticsowner();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addstatisticsowner(mo);
	    System.out.println("增加"+getName());
		
		return "addstatisticsowner";	
	}
	//删除统计停车费缴费情况
	public String deletestatisticsowner() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deletestatisticsowner(chinaName);
		return "deletestatisticsowner";	
	}
	//更新统计停车费缴费情况
	public String updatestatisticsowner() throws Exception{
		statisticsowner mo = new statisticsowner();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updatestatisticsowner(mo);
		return "updatestatisticsowner";	
	}
	//显示统计停车费缴费情况
	public String showstatisticspark() throws Exception{
		totalPageNum=ib.getshowstatisticsownerTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		statisticsparks = ib.showstatisticspark(rows, pageNo);
		for(statisticspark o:statisticsparks){
			System.out.println(""+o.getName());
		}
		return "showstatisticspark";	
	}
	//增加统计停车费缴费情况
	public String addstatisticspark() throws Exception{
		statisticspark mo = new statisticspark();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addstatisticspark(mo);
	    System.out.println("增加"+getName());
		
		return "addstatisticspark";	
	}
	//删除统计停车费缴费情况
	public String deletestatisticspark() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deletestatisticspark(chinaName);
		return "deletestatisticspark";	
	}
	//更新统计停车费缴费情况
	public String updatestatisticspark() throws Exception{
		statisticspark mo = new statisticspark();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updatestatisticspark(mo);
		return "updatestatisticspark";	
	}
}
