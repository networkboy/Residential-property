package com.ibm.erp.action;

import java.util.List;

import com.ibm.erp.business.IManageBBusiness;
import com.ibm.manageB.value.Manageplot;
import com.ibm.manageB.value.Manageservicefund;
import com.ibm.manageB.value.upkeepcosts;
import com.opensymphony.xwork2.ActionSupport;


public class ManageB extends ActionSupport{
	private int rows=5;
	private int pageNo=1;
	private int totalPageNum=0;
	private String name;
	private String address;
	private String status;
	private String time;
	private List<Manageservicefund> manageservicefund;
	private List<Manageplot> manageplot;
	private List<upkeepcosts> upkeepcosts;
	private IManageBBusiness ib;
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
	public List<Manageplot> getManageplot() {
		return manageplot;
	}
	public void setManageplot(List<Manageplot> manageplot) {
		this.manageplot = manageplot;
	}
	public List<Manageservicefund> getManageservicefund() {
		return manageservicefund;
	}
	public void setManageservicefund(List<Manageservicefund> manageservicefund) {
		this.manageservicefund = manageservicefund;
	}
	public List<upkeepcosts> getUpkeepcosts() {
		return upkeepcosts;
	}
	public void setUpkeepcosts(List<upkeepcosts> upkeepcosts) {
		this.upkeepcosts = upkeepcosts;
	}
    public IManageBBusiness getIb() {
		return ib;
	}
	public void setIb(IManageBBusiness ib) {
		this.ib = ib;
	}
	//显示管理维修基金信息
	public String showManageservicefund() throws Exception{
		totalPageNum=ib.getshowManageservicefundTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		manageservicefund = ib.showManageservicefund(rows, pageNo);
		for(Manageservicefund o:manageservicefund){
			System.out.println(""+o.getName());
		}
		return "showManageservicefund";	
	}
    //增加管理维修基金信息
	public String addManageservicefund() throws Exception{
		Manageservicefund mo = new Manageservicefund();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		ib.addManageservicefund(mo);
	    System.out.println("增加"+getName());
		
		return "addManageservicefund";	
	}
	//删除管理维修基金信息
	public String deleteManageservicefund() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageservicefund(chinaName);
		return "deleteManageservicefund";	
	}
	//更新管理维修基金信息
	public String updateManageservicefund() throws Exception{
		Manageservicefund mo = new Manageservicefund();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManageservicefund(mo);
		return "updateManageservicefund";	
	}
	//显示管理小区维护项目信息
	public String showManageplot() throws Exception{
		totalPageNum=ib.getshowManageplotTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		manageplot = ib.showManageplot(rows, pageNo);
		for(Manageplot o:manageplot){
			System.out.println(""+o.getName());
		}
		return "showManageplot";	
	}
	//增加管理小区维护项目信息
	public String addManageplot() throws Exception{
		Manageplot mo = new Manageplot();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		ib.addManageplot(mo);
	    System.out.println("增加"+getName());
		return "addManageplot";	
	}
	//删除管理维修基金信息
	public String deleteManageplot() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteManageplot(chinaName);
		return "deleteManageplot";	
	}
	//更新管理小区维护项目信息
	public String updateManageplot() throws Exception{
		Manageplot mo = new Manageplot();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
		
	    ib.updateManageplot(mo);
		return "updateManageplot";	
	}
	//显示维修费用结算信息
	public String showupkeepcosts() throws Exception{
		totalPageNum=ib.getshowupkeepcostsTotalPageNum(rows);
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPageNum)
		{
			pageNo=totalPageNum;
		}
		upkeepcosts = ib.showupkeepcosts(rows, pageNo);
		for(upkeepcosts o:upkeepcosts){
			System.out.println(""+o.getName());
		}
		return "showupkeepcosts";	
	}
	//增加维修费用结算信息
	public String addupkeepcosts() throws Exception{
		upkeepcosts mo = new upkeepcosts();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		ib.addupkeepcosts(mo);
	    System.out.println("增加"+getName());
		
		return "addupkeepcosts";	
	}
	//删除维修费用结算信息
	public String deleteupkeepcosts() throws Exception{
		String chinaName = new String(getName().getBytes("ISO8859_1"),"UTF8");
		System.out.println(""+getName());
		System.out.println("utf-8"+chinaName);
	    ib.deleteupkeepcosts(chinaName);
		return "deleteupkeepcosts";	
	}
	//更新维修费用结算信息
	public String updateupkeepcosts() throws Exception{
		upkeepcosts mo = new upkeepcosts();
		mo.setName(getName());
		mo.setAddress(getAddress());
		mo.setStatus(getStatus());
		mo.setTime(getTime());
		System.out.println(""+getName());
		///System.out.println("utf-8"+chinaName);
	    ib.updateupkeepcosts(mo);
		return "updateupkeepcosts";	
	}
}