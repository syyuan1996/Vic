package entity;

import java.util.Date;

/**
 * ʵ����
 * 1.����Ʒ
 * @author ʩ��Ե
 *
 */
public class Skin {
	private Integer sId; //'��Ʒ���',
	private String  sName;//'��Ʒ����',
	private String  styleName;//'��Ʒ����',
	private String  colour;// '��Ʒ��ɫ',
	private Integer  inventory;//'��Ʒ���',
	private Integer  sale;//'������',
	private Integer  price;//'��Ǯ',
	private String  picture;//ͼƬ·��',
	private Date  time ;//'�ϼ�ʱ��'
	//�޲ι��죬���ڷ���
	public Skin() {
		super();
	}
	//�вι��죬���ڸ���
	public Skin(Integer sId, String sName, String styleName, String colour, Integer inventory, Integer sale,
			Integer price, String picture, Date time) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.styleName = styleName;
		this.colour = colour;
		this.inventory = inventory;
		this.sale = sale;
		this.price = price;
		this.picture = picture;
		this.time = time;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
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
	/**
	 * ��ʾ
	 */
	@Override
	public String toString() {
		return "Skin [sId=" + sId + ", sName=" + sName + ", styleName=" + styleName + ", colour=" + colour
				+ ", inventory=" + inventory + ", sale=" + sale + ", price=" + price + ", picture=" + picture
				+ ", time=" + time + "]";
	}
	
	
}
