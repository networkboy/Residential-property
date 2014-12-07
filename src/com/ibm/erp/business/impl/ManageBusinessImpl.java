package com.ibm.erp.business.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.erp.business.IManageBusiness;
import com.ibm.manage.value.ManageValue;

public class ManageBusinessImpl implements IManageBusiness{
    private HibernateTemplate ht=null;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	//显示管理员和级别
	@SuppressWarnings("unchecked")
	public List<ManageValue> showManage() throws Exception {	
		String hql="from ManageValue";
		return ht.find(hql);
	}
	public boolean loginManage(String id,String password) throws Exception{
		ManageValue mv = (ManageValue) ht.get(ManageValue.class, id);
		if(mv !=null&&mv.getPassword().equals(password)){
		ServletActionContext.getServletContext().setAttribute("mv",mv);
		return true;
		}
		else
		return false;
	}

}
