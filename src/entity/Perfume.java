package entity;

import java.util.Date;

/**
 * ʵ����
 * 3.��ˮ
 * @author ʩ��Ե
 *
 */
public class Perfume {
	private Integer pId ;//1��Ʒ���
	private String pName;//2��Ʒ��
	private String styleName; //3��Ʒ����
	private String  colour;//4��Ʒ��ɫ
	private Integer  inventory;//5��Ʒ���
	private Integer  sale;//6������
	private Integer  price; //7��Ǯ
	private String picture;//8ͼƬ·��
	private Date time;//9�ϼ�ʱ��
	//�޲ι���
	public Perfume() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�вι���
	public Perfume(Integer pId, String pName, String styleName, String colour, Integer inventory, Integer sale,
			Integer price, String picture, Date time) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.styleName = styleName;
		this.colour = colour;
		this.inventory = inventory;
		this.sale = sale;
		this.price = price;
		this.picture = picture;
		this.time = time;
	}
	//get��set����
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
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
		return "Perfume [pId=" + pId + ", pName=" + pName + ", styleName=" + styleName + ", colour=" + colour
				+ ", inventory=" + inventory + ", sale=" + sale + ", price=" + price + ", picture=" + picture
				+ ", time=" + time + "]";
	}
	
	
}
