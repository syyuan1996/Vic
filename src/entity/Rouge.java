package entity;

import java.util.Date;

/**
 * ʵ����
 * 2.�ں�
 * @author ʩ��Ե
 *
 */
public class Rouge {
	private Integer rId; //'��Ʒ���',
	private String  rName;//'��Ʒ����',
	private String  styleName;//'��Ʒ����',
	private String  colour;// '��Ʒ��ɫ',
	private Integer  inventory;//'��Ʒ���',
	private Integer  sale;//'������',
	private Integer  price;//'��Ǯ',
	private String  picture;//ͼƬ·��',
	private Date  time ;//'�ϼ�ʱ��'
	//�޲ι���
	public Rouge() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�вι���
	public Rouge(Integer rId, String rName, String styleName, String colour, Integer inventory, Integer sale,
			Integer price, String picture, Date time) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.styleName = styleName;
		this.colour = colour;
		this.inventory = inventory;
		this.sale = sale;
		this.price = price;
		this.picture = picture;
		this.time = time;
	}
	/**
	 * get��set����
	 * get��ӦEL���ʽȡֵ�淶
	 * @return
	 */
	public Integer getrId() {
		return rId;
	}
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	//��ʾ
	@Override
	public String toString() {
		return "Rouge [rId=" + rId + ", rName=" + rName + ", styleName=" + styleName + ", colour=" + colour
				+ ", inventory=" + inventory + ", sale=" + sale + ", price=" + price + ", picture=" + picture
				+ ", time=" + time + "]";
	}
	
	
	
}
