package com.hibernate.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.util.GetHibernate;
import com.model.*;

public class HibernateUtil {
	static private Session session;
	static GetHibernate hib = new GetHibernate();  //����
	
	//������վ������Ϣ
	//�鴦����food��վ������Ϣ
	public static List findFoodWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbWkind where kind = 'food' ");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�鴦����movie��վ������Ϣ
	public static List findMovieWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbWkind where kind = 'movie' ");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//��ѯ����KTV��վ���� ��Ϣ
	public static List findKtvWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbWkind where kind = 'ktv' ");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//��ѯ����hotel��վ���� ��Ϣ
	public static List findHotelWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbWkind where kind = 'hotel' ");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//��ѯ����take��վ���� ��Ϣ
	public static List findTakeWkind() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbWkind where kind = 'take' ");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//��������food
	//�����������1��food
	public static List findFoodAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbFood where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������2��food
	public static List findFoodAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbFood where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������3��food
	public static List findFoodAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbFood where tbWkind = '3'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//��������movie
	//�����������1��movie
	public static List findMovieAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbMovie where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������2��movie
	public static List findMovieAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbMovie where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������3��movie
	public static List findMovieAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbMovie where tbWkind = '3'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//��ѯ����ktv
	//�����������1��ktv
	public static List findKtvAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbKtv where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������2��ktv
	public static List findKtvAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbKtv where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������3��ktv
	public static List findKtvAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbKtv where tbWkind = '3'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}

	//��ѯ����hotel
	//�����������1��hotel
	public static List findHotelAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbHotel where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������2��hotel
	public static List findHotelAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbHotel where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������3��hotel
	public static List findHotelAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbHotel where tbWkind = '3'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}

	//�����������1��take
	public static List findTakeAll1() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbTake where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������2��take
	public static List findTakeAll2() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbTake where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	//�����������3��take
	public static List findTakeAll3() {
		Transaction tx = null;
		List list = null;
		try {
			session = hib.openSession();                    //���ù�����Ŀ���session������
			tx = (Transaction) session.beginTransaction();  //��������
			Query query = session.createQuery("from TbTake where tbWkind = '3'");  //Ӧ��HQL�����������������ļ���
			list = query.list();                             //list��������ִ��HQL���
			tx.commit();                                     //������ύ
			hib.closeSession(session);                       //�ر�session
		} catch (Exception e) {
			e.printStackTrace();							//����쳣��Ϣ
			if (tx != null)
				tx.rollback();                                   //����Ļع�
		}
		return list;
	}
	
	
	  //������վ������Ϣ
		//�鴦����taobao��վ������Ϣ
		public static List findTaobaoWkind() {
			Transaction tx = null;
			List list = null;
			try {
				System.out.println("jinalaile ");
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbWkind where kind  = 'taobao' ");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				System.out.println("shibai");
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		
		//�鴦����jumeiyoupin��վ������Ϣ
		public static List findJumeikind() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbWkind where kind = 'jumeiyoupin' ");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
						tx.rollback();                                   //����Ļع�
				}
			return list;
		}
				
		//�鴦����yihaodian��վ������Ϣ
		public static List findYhaodianWkind() {
			Transaction tx = null;
			List list = null;
				try {
					session = hib.openSession();                    //���ù�����Ŀ���session������
					tx = (Transaction) session.beginTransaction();  //��������
					Query query = session.createQuery("from TbWkind where kind = 'yihaodian' ");  //Ӧ��HQL�����������������ļ���
					list = query.list();                             //list��������ִ��HQL���
					tx.commit();                                     //������ύ
					hib.closeSession(session);                       //�ر�session
				} catch (Exception e) {
					e.printStackTrace();							//����쳣��Ϣ
					if (tx != null)
						tx.rollback();                                   //����Ļع�
				}
			return list;
		}
		
		//�鴦����mogujie��վ������Ϣ
		public static List findMogujieWkind() {
			Transaction tx = null;
			List list = null;
				try {
					session = hib.openSession();                    //���ù�����Ŀ���session������
					tx = (Transaction) session.beginTransaction();  //��������
					Query query = session.createQuery("from TbWkind where kind  = 'mogujie' ");  //Ӧ��HQL�����������������ļ���
					list = query.list();                             //list��������ִ��HQL���
					tx.commit();                                     //������ύ
					hib.closeSession(session);                       //�ر�session
				} catch (Exception e) {
					e.printStackTrace();							//����쳣��Ϣ
					if (tx != null)
						tx.rollback();                                   //����Ļع�
				}
			return list;
		}
		
		//�鴦����yamaxun��վ������Ϣ
		public static List findYamaxunWkind() {
			Transaction tx = null;
			List list = null;
				try {
					session = hib.openSession();                    //���ù�����Ŀ���session������
					tx = (Transaction) session.beginTransaction();  //��������
					Query query = session.createQuery("from TbWkind where kind = 'amazon' ");  //Ӧ��HQL�����������������ļ���
					list = query.list();                             //list��������ִ��HQL���
					tx.commit();                                     //������ύ
					hib.closeSession(session);                       //�ر�session
				} catch (Exception e) {
					e.printStackTrace();							//����쳣��Ϣ
					if (tx != null)
						tx.rollback();                                   //����Ļع�
				}
			return list;
		}
		
		
		//��������taobao
		//�����������1��taobao
		public static List findTaobaoAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbTaobao where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		
		//�����������2��taobao
		public static List findTaobaoAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbTaobao where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		//�����������3��taobao
		public static List findTaobaoAll3() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbTaobao where tbWkind = '3'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		//��������jumeiyoupin
		//�����������1��jumeiyoupin
		public static List findJumeiAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbJumeiyoupin where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		//�����������2��jumeiyoupin
		public static List findJumeiAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbJumeiyoupin where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		
		//��������yihaodian
		//�����������1��yihaodian
		public static List findYihaodianAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbYihaodian where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		
		//�����������2��yihaodian
		public static List findYihaodianAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbYihaodian where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		//��������mogujie
		//�����������1��mogujie
		public static List findMogujieAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbMogujie where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		//�����������2��mogujie
		public static List findMogujieAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbMogujie where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		
		//��������yamaxun
		//�����������1��yamaxun
		public static List findYamaxunAll1() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbAmazon where tbWkind = '1'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
		
		//�����������2��yamaxun
		public static List findYamaxunAll2() {
			Transaction tx = null;
			List list = null;
			try {
				session = hib.openSession();                    //���ù�����Ŀ���session������
				tx = (Transaction) session.beginTransaction();  //��������
				Query query = session.createQuery("from TbAmazon where tbWkind = '2'");  //Ӧ��HQL�����������������ļ���
				list = query.list();                             //list��������ִ��HQL���
				tx.commit();                                     //������ύ
				hib.closeSession(session);                       //�ر�session
			} catch (Exception e) {
				e.printStackTrace();							//����쳣��Ϣ
				if (tx != null)
					tx.rollback();                                   //����Ļع�
			}
			return list;
		}
}

	
