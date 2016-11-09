package po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import util.OrderStatus;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class OrderPO implements Serializable {
	// �ͻ�����������
	private String customerName;
	// �ֻ���
	private String phone;
	// ���֤��
	private String customerID;
	// �Ƶ�ID
	private String hotelID;
	// �Ƶ�����
	private String hotelName;
	// ������
	private String orderID;
	// Ԥ�ƶ�����ʼʱ��
	private Date estimatedCheckinTime;
	// ʵ�ʶ�����ʼʱ��
	private Date actualCheckinTime;
	// Ԥ���˷�ʱ��
	private Date estimatedCheckoutTime;
	// ʵ���˷�ʱ��
	private Date actualCheckoutTime;
	// ������ִ��ʱ��
	private Date latestExecutedTime;
	// �������ͼ�����
	private List<String> rooms;
	// Ԥ����ס����
	private int numOfCustomers;
	// ���޶�ͯ
	private boolean haveChildren;
	// ��ע
	private String remarks;
	// ʹ�õ��Żݲ�������
	private String promotionName;
	// �ۿ�ǰ�۸�
	private double initialPrice;
	// �ۿۺ�۸�
	private double finalPrice;
	// ����״̬
	private OrderStatus orderType;

	public OrderPO() {

	}

	// ��actualCheckoutTime��actualCheckinTime���ڹ��캯���У�����Ϊ��������´������������
	public OrderPO(String customerName, String phone, String customerID, String hotelID,String hotelName, String orderID,
			Date estimatedCheckinTime, Date actualCheckinTime, Date estimatedCheckoutTime, Date actualCheckoutTime,
			Date latestExecutedTime, List<String> rooms, int numOfCustomers, boolean haveChildren, String remarks,
			String promotionName, double initialPrice, double finalPrice, OrderStatus orderType) {
		this.customerName = customerName;
		this.phone = phone;
		this.customerID = customerID;
		this.hotelID=hotelID;
		this.hotelName = hotelName;
		this.orderID = orderID;
		this.estimatedCheckinTime = estimatedCheckinTime;
		this.actualCheckinTime = actualCheckinTime;
		this.estimatedCheckoutTime = estimatedCheckoutTime;
		this.actualCheckoutTime = actualCheckoutTime;
		this.latestExecutedTime = latestExecutedTime;
		this.rooms = rooms;
		this.numOfCustomers = numOfCustomers;
		this.haveChildren = haveChildren;
		this.remarks = remarks;
		this.promotionName = promotionName;
		this.initialPrice = initialPrice;
		this.finalPrice = finalPrice;
		this.orderType = orderType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getHotelID(){
		return hotelID;
	}
	
	public void setHotelID(String hotelID){
		this.hotelID=hotelID;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Date getEstimatedCheckinTime() {
		return estimatedCheckinTime;
	}

	public void setEstimatedCheckinTime(Date estimatedCheckinTime) {
		this.estimatedCheckinTime = estimatedCheckinTime;
	}

	public Date getActualCheckinTime() {
		return actualCheckinTime;
	}

	public void setActualCheckinTime(Date actualCheckinTime) {
		this.actualCheckinTime = actualCheckinTime;
	}

	public Date getEstimatedCheckoutTime() {
		return estimatedCheckoutTime;
	}

	public void setEstimatedCheckoutTime(Date estimatedCheckoutTime) {
		this.estimatedCheckoutTime = estimatedCheckoutTime;
	}

	public Date getActualCheckoutTime() {
		return actualCheckoutTime;
	}

	public void setActualCheckoutTime(Date actualCheckoutTime) {
		this.actualCheckoutTime = actualCheckoutTime;
	}

	public Date getLatestExecutedTime() {
		return latestExecutedTime;
	}

	public void setLatestExecutedTime(Date latestExecutedTime) {
		this.latestExecutedTime = latestExecutedTime;
	}

	public List<String> getRooms() {
		return rooms;
	}

	public void setRooms(List<String> rooms) {
		this.rooms = rooms;
	}

	public int getNumOfCustomers() {
		return numOfCustomers;
	}

	public void setNumOfCustomers(int numOfCustomers) {
		this.numOfCustomers = numOfCustomers;
	}

	public boolean isHaveChildren() {
		return haveChildren;
	}

	public void setHaveChildren(boolean haveChildren) {
		this.haveChildren = haveChildren;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public double getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(double initialPrice) {
		this.initialPrice = initialPrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public OrderStatus getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderStatus orderType) {
		this.orderType = orderType;
	}

}