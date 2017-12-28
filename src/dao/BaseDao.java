package dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import utils.JDBCUtil;

/**
 * ������Ӧ����
 * �������ݿ����ɾ�Ĳ�
 * �����������������ɾ�Ĳ�,�������õ�����T
 * --�����͵�ʵ����
 * ��֤��ͬ��ʵ����̳и�����Խ��в�ͬ��������ɾ�Ĳ�
 * 
 * @author ʩ��Ե
 * 2017/12/28
 */
public class BaseDao<T> {
	//DBUtil�еĺ�����
	QueryRunner runn=new QueryRunner();
	
	
	//ʵ���������
	private Class<T> type;
	
	/**
	 * ע��:��T���̳�BaseDao,����������
	 * �����ཫ����ø�����޲ι���
	 * ���Դ��������޲ι���,�ڱ�����ʱ��ֵ
	 * ʵ��ʵ��������type�ļ���
	 */
	//�޲ι���
	@SuppressWarnings("unchecked")
	public BaseDao(){
		/**
		 * ����Ҫ��ȡ���̳�BaseDao��ʵ����
		 * �ٻ�ȡ����������������
		 */
		//��UserDao extend BaseDao<User>
		//1.��ȡ��ǰʵ����(UserDao)�Ĵ����͵ĸ���(BaseDao)
		//Type tp = this.getClass().getGenericSuperclass();
		/**
		 * TypeΪһ���ӿ�
		 * �����ж��ʵ����,�����и�ParameteriedTypeΪ�����͵���
		 * ����ʵ��T��Ҫ��,���Խ�Type����ParameterizedType
		 * �˴���Ҫǿת(TypeΪParameterizedType���ϼ�,��תСǿת)
		 */
		//�˴�ptΪ��ȡ��BaseDao
		ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();
		
		/**
		 * ��ȡ����������������
		 * ����һ������
		 * ������Ҫ���Ǵ����͵�������Ķ���,Ϊһ��
		 * ����������ʵֻ�ǰ���һ�����ݵ�����,ֻ��ȡ����һ��
		 * 
		 */
		Type[] types = pt.getActualTypeArguments();
		//��ȡһ������Ϳ���
		this.type=(Class<T>) types[0];		
	}
	

	/**
	 * ͨ�õ���ɾ�Ĳ���
	 * ʹ��DBUtil��query()����
	 */
	public int update(String sql,Object...args){
		int count=0;
		//�������ݿ�--ֱ�ӵ����������ݿ�ķ���
		Connection conn=JDBCUtil.getConnection();
		
		//���ú������update����
		try {
			//�÷�������ֵ����Ϊint
			count=runn.update(conn, sql, args);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.closeConnection(null, null, conn);
		}
		return count;
		
	}
	
	/**
	 * ͨ�õĲ�ѯһ�����ݵĲ���
	 * �����ݷ���һ��������
	 * �ö��������,ʹ��T
	 * ʹ��DBUtil��update����
	 */
	public T getBean(String sql,Object...args){
		T t=null;
		Connection conn=JDBCUtil.getConnection();

		try {
			//ʹ��DBUtil�ķ���
			/**
			 * ����new BeanHandler<T>(type)
			 * T����ͬ��ʵ����,typeΪʵ���������
			 * eg.new BeanHandler<User>(User.class)
			 * �˴��õ�����ͷ���
			 */
			t=runn.query(conn, sql, new BeanHandler<T>(type), args);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.closeConnection(null, null, conn);
		}
		return t;
		
	}
	
	/**
	 * ͨ�õĲ�ѯ�������ݵĲ���
	 * ����һ��List����
	 * ʹ��DBUtil��update()����
	 */
	public List<T> getListBean(String sql,Object...args){
		List<T> list=new ArrayList<T>();
		//�������ݿ�
		Connection conn=JDBCUtil.getConnection();
		
		//ʹ��DBUtil�еķ���
		try {
			/**
			 * new BeanListHandler<T>(type)
			 * ���ڲ�ѯ���ݿ������Ϣ�Ľ�����洢
			 */
			list=runn.query(conn, sql, new BeanListHandler<T>(type), args);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.closeConnection(null, null, conn);
		}
		return list;
		
	}
	
}
