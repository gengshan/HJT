package com.hibernate.util;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource; 
import org.springframework.core.io.Resource; 
//��hibernate�йܸ�Springʱ�õ�sessionFactory 
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
	
	public Session openSession(){			//��SessionΪ����ֵ������Session����
		Session session = sf.openSession();   //SessionFactory��openSession()�������Sessionʵ��
		return session;
	}
	public void closeSession(Session session){  //�����ر�Session����������ΪSessionʵ��
		if(session != null){                //close()�����ر�session
			session.close();
		}
	}
	
}
