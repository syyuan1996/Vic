package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import entity.User;
/**
 * 
 * dao��
 * ʵ�ֵ�¼
 * @author ʩ��Ե
 *
 */
public class UserDaoImpl extends BaseDao<User> implements UserDao{


	/**
	 * ��¼����
	 */
	@Override
	public User getUserByTwo(User user) {
		String sql="select * from user where userName=?and email=?";
		User bean = this.getBean(sql, user.getUserName(),user.getEmail());
		return bean;
	}

}
