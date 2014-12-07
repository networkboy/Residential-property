package com.ibm.erp.business.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

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

public class ManageCBusinessImpl implements IManageCBusiness {
	private HibernateTemplate ht=null;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	//显示页数
	public int getshowManagechargemanagementTotalPageNum(int rows)
			throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getManagechargemanagementCountByAll();
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
	
	@Override
	public int getshowManagehomeTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getManagehomeCountByAll();
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

	@Override
	public int getshowManageownersTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getManageownersCountByAll();
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

	@Override
	public int getshowManageparkTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getManageparktCountByAll();
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

	@Override
	public int getshowManageparkmanageTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getManageparkmanageCountByAll();
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

	@Override
	public int getshowManageuserTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getManageuserCountByAll();
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

	@Override
	public int getshowstatisticsownerTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getstatisticsownerCountByAll();
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

	@Override
	public int getshowstatisticsparkTotalPageNum(int rows) throws Exception {
		// TODO Auto-generated method stub
		int Count=this.getstatisticsparkCountByAll();
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
	public int getManagechargemanagementCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Managechargemanagement mo"));
	}
	public int getManagehomeCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Managehome mo"));
	}
	public int getManageownersCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageowners mo"));
	}
	public int getManageparktCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Managepark mo"));
	}
	public int getManageparkmanageCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageparkmanage mo"));
	}
	public int getManageuserCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from Manageuser mo"));
	}
	public int getstatisticsownerCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from statisticsowner mo"));
	}
	public int getstatisticsparkCountByAll() throws Exception {
		return DataAccessUtils.intResult(ht.find("select count(mo) from statisticspark mo"));
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Managechargemanagement> showManagechargemanagement(final int rows,final int pageNo) throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Managechargemanagement";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addManagechargemanagement(Managechargemanagement mo)
			throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);	

	}

	@Override
	public void deleteManagechargemanagement(String name) throws Exception {
		// TODO Auto-generated method stub
		Managechargemanagement mo=(Managechargemanagement)ht.get(Managechargemanagement.class, name);
		ht.delete(mo);
	}

	@Override
	public void updateManagechargemanagement(Managechargemanagement mo)
			throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Managehome> showManagehome(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Managehome";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addManagehome(Managehome mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deleteManagehome(String name) throws Exception {
		// TODO Auto-generated method stub
		Managehome mo=(Managehome)ht.get(Managehome.class, name);
		ht.delete(mo);
	}

	@Override
	public void updateManagehome(Managehome mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Manageowners> showManageowners(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Manageowners";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addManageowners(Manageowners mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deleteManageowners(String name) throws Exception {
		// TODO Auto-generated method stub
		Manageowners mo=(Manageowners)ht.get(Manageowners.class, name);
		ht.delete(mo);
	}

	@Override
	public void updateManageowners(Manageowners mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Managepark> showManagepark(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Managepark";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addManagepark(Managepark mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deleteManagepark(String name) throws Exception {
		// TODO Auto-generated method stub
		Managepark mo=(Managepark)ht.get(Managepark.class, name);
		ht.delete(mo);
	}

	@Override
	public void updateManagepark(Managepark mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Manageparkmanage> showManageparkmanage(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Manageparkmanage";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addManageparkmanage(Manageparkmanage mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deleteManageparkmanage(String name) throws Exception {
		// TODO Auto-generated method stub
		Manageparkmanage mo=(Manageparkmanage)ht.get(Manageparkmanage.class, name);
		ht.delete(mo);
	}

	@Override
	public void updateManageparkmanage(Manageparkmanage mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Manageuser> showManageuser(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from Manageuser";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addManageuser(Manageuser mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deleteManageuser(String name) throws Exception {
		// TODO Auto-generated method stub
		Manageuser mo=(Manageuser)ht.get(Manageuser.class, name);
		ht.delete(mo);
	}

	@Override
	public void updateManageuser(Manageuser mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<statisticsowner> showstatisticsowner(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from statisticsowner";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addstatisticsowner(statisticsowner mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deletestatisticsowner(String name) throws Exception {
		// TODO Auto-generated method stub
		statisticsowner mo=(statisticsowner)ht.get(statisticsowner.class, name);
		ht.delete(mo);
	}

	@Override
	public void updatestatisticsowner(statisticsowner mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<statisticspark> showstatisticspark(final int rows,final int pageNo)
			throws Exception {
		// TODO Auto-generated method stub
		final String hql="from statisticspark";
		return ht.executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException, SQLException {	
		Query query=session.createQuery(hql);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(pageNo-1));
		return query.list();
		}
		});
	}

	@Override
	public void addstatisticspark(statisticspark mo) throws Exception {
		// TODO Auto-generated method stub
		ht.save(mo);
	}

	@Override
	public void deletestatisticspark(String name) throws Exception {
		// TODO Auto-generated method stub
		statisticspark mo=(statisticspark)ht.get(statisticspark.class, name);
		ht.delete(mo);
	}

	@Override
	public void updatestatisticspark(statisticspark mo) throws Exception {
		// TODO Auto-generated method stub
		ht.update(mo);
	}

}
