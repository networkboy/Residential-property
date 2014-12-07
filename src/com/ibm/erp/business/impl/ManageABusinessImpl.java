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

import com.ibm.erp.business.IManageABusiness;
import com.ibm.manageA.value.Manageowner;
import com.ibm.manageA.value.Manageservice;
@Transactional
public class ManageABusinessImpl implements IManageABusiness {
	private HibernateTemplate ht=null;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	//显示页数
	public int getshowManageownerTotalPageNum(int rows) throws Exception{
		int Count=this.getshowManageownerCountByAll();
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
	public int getshowManageserviceTotalPageNum(int rows) throws Exception{
		int Count=this.getshowManageserviceCountByAll();
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
	public int getshowManageownerCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageowner mo"));
	}
	public int getshowManageserviceCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageservice mo"));
	}
	
	//显示管理业主缴纳物业管理费信息
	@SuppressWarnings("unchecked")
	public List<Manageowner> showManageowner(final int rows,final int pageNo) throws Exception {
		// TODO Auto-generated method stub
//		String hql="from Manageowner";
//		return ht.find(hql);
		final String hql="from Manageowner";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}
	//增加管理业主缴纳物业管理费信息
	public void addManageowner(Manageowner mo) throws Exception{
		ht.save(mo);		
	}
	//删除管理业主缴纳物业管理费信息
	public void deleteManageowner(String name) throws Exception{
//		sessionFactory.getCurrentSession().delete(
//				sessionFactory.getCurrentSession().load(Manageowner.class, name));
		Manageowner mo=(Manageowner)ht.get(Manageowner.class, name);
		ht.delete(mo);
		
	}
	//更新管理业主缴纳物业管理费信息
	public void updateManageowner(Manageowner mo) throws Exception{
		//sessionFactory.getCurrentSession().merge(mo);
		ht.update(mo);
	}
	//显示管理维修信息
	@SuppressWarnings("unchecked")
	public List<Manageservice> showManageservice(final int rows,final int pageNo) throws Exception{
		//return sessionFactory.getCurrentSession().createQuery("from Manageservice").list();
		final String hql="from Manageservice";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}
	//删除管理维修信息
	public void deleteManageservice(String name) throws Exception{
		Manageservice mo=(Manageservice)ht.get(Manageservice.class, name);
		ht.delete(mo);
	}
	//增加管理维修信息
	public void addManageservice(Manageservice mo) throws Exception{
		//sessionFactory.getCurrentSession().persist(mo);	
		ht.save(mo);
	}
	//更新管理维修信息
	public void updateManageservice(Manageservice mo) throws Exception{
		//sessionFactory.getCurrentSession().merge(mo);
		ht.update(mo);
	}

}
