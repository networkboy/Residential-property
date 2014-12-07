package com.ibm.erp.business;

import java.util.List;
import com.ibm.manageB.value.Manageplot;
import com.ibm.manageB.value.Manageservicefund;
import com.ibm.manageB.value.upkeepcosts;

public interface IManageBBusiness {
		//显示页数
		public int getshowManageservicefundTotalPageNum(int rows) throws Exception;
		public int getshowManageplotTotalPageNum(int rows) throws Exception;
		public int getshowupkeepcostsTotalPageNum(int rows) throws Exception;
	    
	    //显示管理维修基金信息
		public List<Manageservicefund> showManageservicefund(int rows, int pageNo) throws Exception;
		//增加管理维修基金信息
		public void addManageservicefund(Manageservicefund mo) throws Exception;
		//删除管理维修基金信息
		public void deleteManageservicefund(String name) throws Exception;
		//更新管理维修基金信息
		public void updateManageservicefund(Manageservicefund mo) throws Exception;
		
		
	    //显示管理小区维护项目信息
		public List<Manageplot> showManageplot(int rows, int pageNo) throws Exception;
		//增加管理小区维护项目信息
		public void addManageplot(Manageplot mo) throws Exception;
		//删除管理小区维护项目信息
		public void deleteManageplot(String name) throws Exception;
		//更新管理小区维护项目信息
		public void updateManageplot(Manageplot mo) throws Exception;
		
		
		//显示维修费用结算信息
		public List<upkeepcosts> showupkeepcosts(int rows, int pageNo) throws Exception;
		//增加维修费用结算信息
		public void addupkeepcosts(upkeepcosts mo) throws Exception;
		//删除维修费用结算信息
		public void deleteupkeepcosts(String name) throws Exception;
		//更新维修费用结算信息
		public void updateupkeepcosts(upkeepcosts mo) throws Exception;
		
}
