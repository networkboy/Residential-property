package com.ibm.erp.business.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.erp.business.IManageBBusiness;
import com.ibm.manageA.value.Manageowner;
import com.ibm.manageA.value.Manageservice;
import com.ibm.manageB.value.Manageplot;
import com.ibm.manageB.value.Manageservicefund;
import com.ibm.manageB.value.upkeepcosts;

public class ManageBBusinessImpl implements IManageBBusiness {
	private HibernateTemplate ht=null;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	//显示页数
	public int getshowManageservicefundTotalPageNum(int rows) throws Exception{
		int Count=this.getshowManageservicefundCountByAll();
		int pageNum=0;
		if(Count%rows==0)
		{
			pageNum=Count/rows;
		}
		else
		{
			pageNum=Count/rows+1;
		}
		return pageNum;
	}
	public int getshowManageplotTotalPageNum(int rows) throws Exception{
		int Count=this.getshowManageplotCountByAll();
		int pageNum=0;
		if(Count%rows==0)
		{
			pageNum=Count/rows;
		}
		else
		{
			pageNum=Count/rows+1;
		}
		return pageNum;
	}
	public int getshowupkeepcostsTotalPageNum(int rows) throws Exception{
		int Count=this.getshowupkeepcostsCountByAll();
		int pageNum=0;
		if(Count%rows==0)
		{
			pageNum=Count/rows;
		}
		else
		{
			pageNum=Count/rows+1;
		}
		return pageNum;
	}
	//查询个数
	public int getshowManageservicefundCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageservicefund mo"));
	}
	public int getshowManageplotCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageplot mo"));
	}
	public int getshowupkeepcostsCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from upkeepcosts mo"));
	}
	//显示管理维修基金信息
	@SuppressWarnings("unchecked")
	public List<Manageservicefund> showManageservicefund(final int rows,final int pageNo) throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Manageservicefund";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}
	//增加管理维修基金信息
	public void addManageservicefund(Manageservicefund mo) throws Exception {
		ht.save(mo);	

	}

	//删除管理维修基金信息
	public void deleteManageservicefund(String name) throws Exception {
		Manageservicefund mo=(Manageservicefund)ht.get(Manageservicefund.class, name);
		ht.delete(mo);

	}

	//更新管理维修基金信息
	public void updateManageservicefund(Manageservicefund mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	//显示管理小区维护项目信息
	@SuppressWarnings("unchecked")
	public List<Manageplot> showManageplot(final int rows,final int pageNo) throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Manageplot";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	//增加管理小区维护项目信息
	public void addManageplot(Manageplot mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	//删除管理小区维护项目信息
	public void deleteManageplot(String name) throws Exception {
		// TODO Auto-generated method stub
		Manageplot mo=(Manageplot)ht.get(Manageplot.class, name);
		ht.delete(mo);
	}

	//更新管理小区维护项目信息
	public void updateManageplot(Manageplot mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	//显示维修费用结算信息
	@SuppressWarnings("unchecked")
	public List<upkeepcosts> showupkeepcosts(final int rows,final int pageNo) throws Exception {
		// TODO Auto-generated method stub
		final String hql="from upkeepcosts";
		return ht.executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {	
			Query query=session.createQuery(hql);
			query.setMaxResults(rows);
			query.setFirstResult(rows*(pageNo-1));
			return query.list();
			}
			});
	}

	//增加维修费用结算信息
	public void addupkeepcosts(upkeepcosts mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	//删除维修费用结算信息
	public void deleteupkeepcosts(String name) throws Exception {
		// TODO Auto-generated method stub
		upkeepcosts mo=(upkeepcosts)ht.get(upkeepcosts.class, name);
		ht.delete(mo);
	}

	//更新维修费用结算信息
	public void updateupkeepcosts(upkeepcosts mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

}
