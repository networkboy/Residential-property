package com.ibm.erp.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.erp.business.IManageABusiness;
import com.ibm.manageA.value.Manageowner;
import com.ibm.manageA.value.Manageservice;
import com.opensymphony.xwork2.ActionSupport;

public class ManageA extends ActionSupport{
	private int rows=5;
	private int pageNo=1;
	private int totalPageNum=0;
	private String name;
	private String address;
	private String status;
	private String time;
	List<Manageowner> manageowner;
	List<Manageservice> manageservice;
	private IManageABusiness ib = null;
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
	public List<Manageowner> getManageowner() {
		return manageowner;
	}
	public void setManageowner(List<Manageowner> manageowner) {
		this.manageowner = manageowner;
	}
	public List<Manageservice> getManageservice() {
		return manageservice;
	}
	public void setManageservice(List<Manageservice> manageservice) {
		this.manageservice = manageservice;
	}
	public IManageABusiness getIb() {
		return ib;
	}
	public void setIb(IManageABusiness ib) {
		this.ib = ib;
	}
	//显示管理业主缴纳物业管理费信息
	public String showManageowner() throws Exception{
		totalPageNum=ib.getshowManageownerTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		manageowner = ib.showManageowner(rows, pageNo);
		for(Manageowner o:manageowner){
			System.out.println(""+o.getName());
		}
		return "showManageowner";	
	}
	//增加管理业主缴纳物业管理费信息
	public String addManageowner() throws Exception{
		Manageowner mo = new Manageowner();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());

		ib.addManageowner(mo);
	    System.out.println("增加"+getName());
		
		return "addManageowner";	
	}
	//删除管理业主缴纳物业管理费信息
	public String deleteManageowner() throws Exception{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		IManageABusiness ib = (IManageABusiness)applicationContext.getBean("manageABusiness");
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageowner(chinaName);
		return "deleteManageowner";	
	}
	//更新管理业主缴纳物业管理费信息
	public String updateManageowner() throws Exception{
//		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
//		String chinaaddress = new String(getAddress().getBytes("ISO8859_1"),"UTF8");
//		String chinastatus = new String(getStatus().getBytes("ISO8859_1"),"UTF8");
//		String chinatime = new String(getTime().getBytes("ISO8859_1"),"UTF8");
		Manageowner mo = new Manageowner();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManageowner(mo);
		return "updateManageowner";	
	}
	//显示管理维修信息
	public String showManageservice() throws Exception{
		totalPageNum=ib.getshowManageserviceTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		//manageowner = ib.showManageowner(rows, pageNo);
		manageservice = ib.showManageservice(rows, pageNo);
		for(Manageservice o:manageservice){
			System.out.println(""+o.getName());
		}
		return "showManageservice";	
	}
	//删除管理维修信息
	public String deleteManageservice() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageservice(chinaName);;
		return "deleteManageservice";	
	}
	//增加管理维修信息
		public String addManageservice() throws Exception{
			Manageservice mo = new Manageservice();
			mo.setName(getName());
			mo.setAddress(getAddress());
			mo.setStatus(getStatus());
			mo.setTime(getTime());
			
			ib.addManageservice(mo);
		    System.out.println("增加"+getName());
			
			return "addManageservice";	
		}
		//更新管理业主缴纳物业管理费信息
		public String updateManageservice() throws Exception{
			Manageservice mo = new Manageservice();
			mo.setName(getName());
			mo.setAddress(getAddress());
			mo.setStatus(getStatus());
			mo.setTime(getTime());
			
			System.out.println(""+getName());
			///System.out.println("utf-8"+chinaName);
			
		    ib.updateManageservice(mo);
			return "updateManageservice";	
		}
}
