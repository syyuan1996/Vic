package entity;

import java.util.Date;

/**
 * �û�ʵ����
 * 
 * @author ʩ��Ե
 *
 */
public class User {
	private Integer id;//��Ա���,
	private String  userName;//��Ա����,
	private String email;//��Ա����,
	private String telephone;//�绰
	private Date createTime;//��Ա����ʱ��
	/**
	 * get��set����
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
