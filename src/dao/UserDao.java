package dao;

import entity.User;

public interface UserDao {
	/**
	 * �û���¼�ķ���
	 * �����û����������ƥ������û���¼
	 * ����һ��User����,�Ա����
	 */
	User getUserByTwo(User user);
}
