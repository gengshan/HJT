package com.hibernate.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.util.GetHibernate;
import com.model.*;

public class HibernateUtil {
	static private Session session;
	static GetHibernate hib = new GetHibernate();  //创建
	
	//查找网站分类信息
	//查处所有food网站分类信息
	public static List findFoodWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事务
			Query query = session.createQuery("from TbWkind where kind = 'food' ");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查处所有movie网站分类信息
	public static List findMovieWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbWkind where kind = 'movie' ");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查询所有KTV网站分类 信息
	public static List findKtvWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbWkind where kind = 'ktv' ");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查询所有hotel网站分类 信息
	public static List findHotelWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbWkind where kind = 'hotel' ");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查询所有take网站分类 信息
	public static List findTakeWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbWkind where kind = 'take' ");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有food
	//查找所有类别1的food
	public static List findFoodAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbFood where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别2的food
	public static List findFoodAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbFood where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别3的food
	public static List findFoodAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbFood where tbWkind = '3'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有movie
	//查找所有类别1的movie
	public static List findMovieAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbMovie where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别2的movie
	public static List findMovieAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbMovie where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别3的movie
	public static List findMovieAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbMovie where tbWkind = '3'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查询所有ktv
	//查找所有类别1的ktv
	public static List findKtvAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbKtv where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别2的ktv
	public static List findKtvAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbKtv where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别3的ktv
	public static List findKtvAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbKtv where tbWkind = '3'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}

	//查询所有hotel
	//查找所有类别1的hotel
	public static List findHotelAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbHotel where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别2的hotel
	public static List findHotelAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbHotel where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别3的hotel
	public static List findHotelAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbHotel where tbWkind = '3'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}

	//查找所有类别1的take
	public static List findTakeAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbTake where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别2的take
	public static List findTakeAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbTake where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	//查找所有类别3的take
	public static List findTakeAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //调用公共类的开启session方法．
			tx = (Transaction) session.beginTransaction();  //开启事物
			Query query = session.createQuery("from TbTake where tbWkind = '3'");  //应用HQL检索查找满足条件的集合
			list = query.list();                             //list方法用来执行HQL语句
			tx.commit();                                     //事务的提交
			hib.closeSession(session);                       //关闭session
		} catch (Exception e) {
			e.printStackTrace();							//输出异常信息
			if (tx != null)
				tx.rollback();                                   //事务的回滚
		}
		return list;
	}
	
	
	  //查找网站分类信息
		//查处所有taobao网站分类信息
		public static List findTaobaoWkind() {
			Transaction tx = null;
			List list = null;
			try {
				System.out.println("jinalaile ");
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事务
				Query query = session.createQuery("from TbWkind where kind  = 'taobao' ");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				System.out.println("shibai");
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		
		//查处所有jumeiyoupin网站分类信息
		public static List findJumeikind() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事务
				Query query = session.createQuery("from TbWkind where kind = 'jumeiyoupin' ");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
						tx.rollback();                                   //事务的回滚
				}
			return list;
		}
				
		//查处所有yihaodian网站分类信息
		public static List findYhaodianWkind() {
			Transaction tx = null;
			List list = null;
				try {
					session = hib.openSession();                    //调用公共类的开启session方法．
					tx = (Transaction) session.beginTransaction();  //开启事务
					Query query = session.createQuery("from TbWkind where kind = 'yihaodian' ");  //应用HQL检索查找满足条件的集合
					list = query.list();                             //list方法用来执行HQL语句
					tx.commit();                                     //事务的提交
					hib.closeSession(session);                       //关闭session
				} catch (Exception e) {
					e.printStackTrace();							//输出异常信息
					if (tx != null)
						tx.rollback();                                   //事务的回滚
				}
			return list;
		}
		
		//查处所有mogujie网站分类信息
		public static List findMogujieWkind() {
			Transaction tx = null;
			List list = null;
				try {
					session = hib.openSession();                    //调用公共类的开启session方法．
					tx = (Transaction) session.beginTransaction();  //开启事务
					Query query = session.createQuery("from TbWkind where kind  = 'mogujie' ");  //应用HQL检索查找满足条件的集合
					list = query.list();                             //list方法用来执行HQL语句
					tx.commit();                                     //事务的提交
					hib.closeSession(session);                       //关闭session
				} catch (Exception e) {
					e.printStackTrace();							//输出异常信息
					if (tx != null)
						tx.rollback();                                   //事务的回滚
				}
			return list;
		}
		
		//查处所有yamaxun网站分类信息
		public static List findYamaxunWkind() {
			Transaction tx = null;
			List list = null;
				try {
					session = hib.openSession();                    //调用公共类的开启session方法．
					tx = (Transaction) session.beginTransaction();  //开启事务
					Query query = session.createQuery("from TbWkind where kind = 'amazon' ");  //应用HQL检索查找满足条件的集合
					list = query.list();                             //list方法用来执行HQL语句
					tx.commit();                                     //事务的提交
					hib.closeSession(session);                       //关闭session
				} catch (Exception e) {
					e.printStackTrace();							//输出异常信息
					if (tx != null)
						tx.rollback();                                   //事务的回滚
				}
			return list;
		}
		
		
		//查找所有taobao
		//查找所有类别1的taobao
		public static List findTaobaoAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbTaobao where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		
		//查找所有类别2的taobao
		public static List findTaobaoAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbTaobao where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		//查找所有类别3的taobao
		public static List findTaobaoAll3() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbTaobao where tbWkind = '3'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		//查找所有jumeiyoupin
		//查找所有类别1的jumeiyoupin
		public static List findJumeiAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbJumeiyoupin where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		//查找所有类别2的jumeiyoupin
		public static List findJumeiAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbJumeiyoupin where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		
		//查找所有yihaodian
		//查找所有类别1的yihaodian
		public static List findYihaodianAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbYihaodian where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		
		//查找所有类别2的yihaodian
		public static List findYihaodianAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbYihaodian where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		//查找所有mogujie
		//查找所有类别1的mogujie
		public static List findMogujieAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbMogujie where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		//查找所有类别2的mogujie
		public static List findMogujieAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbMogujie where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		
		//查找所有yamaxun
		//查找所有类别1的yamaxun
		public static List findYamaxunAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbAmazon where tbWkind = '1'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
		
		//查找所有类别2的yamaxun
		public static List findYamaxunAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //调用公共类的开启session方法．
				tx = (Transaction) session.beginTransaction();  //开启事物
				Query query = session.createQuery("from TbAmazon where tbWkind = '2'");  //应用HQL检索查找满足条件的集合
				list = query.list();                             //list方法用来执行HQL语句
				tx.commit();                                     //事务的提交
				hib.closeSession(session);                       //关闭session
			} catch (Exception e) {
				e.printStackTrace();							//输出异常信息
				if (tx != null)
					tx.rollback();                                   //事务的回滚
			}
			return list;
		}
}

	
