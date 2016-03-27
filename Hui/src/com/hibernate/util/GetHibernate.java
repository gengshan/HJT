package com.hibernate.util;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource; 
import org.springframework.core.io.Resource; 
//在hibernate托管给Spring时得到sessionFactory 
public class GetHibernate {
	private static SessionFactory sf = null;
	
	static{
		try{
			Resource resource=new ClassPathResource("/applicationContext.xml"); 
			BeanFactory factory=new XmlBeanFactory(resource); 
			sf = (SessionFactory)factory.getBean("sessionFactory"); 
		}catch (HibernateException ex) { 
			throw new RuntimeException("Exception building SessionFactory: " 
					+ ex.getMessage(), ex); 
		}
	}
	
	public Session openSession(){			//以Session为返回值创建打开Session方法
		Session session = sf.openSession();   //SessionFactory的openSession()方法获得Session实例
		return session;
	}
	public void closeSession(Session session){  //创建关闭Session方法，参数为Session实例
		if(session != null){                //close()方法关闭session
			session.close();
		}
	}
	
}
