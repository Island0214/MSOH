package po;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class CommentPO implements Serializable {
	// ����
	private double score;
	// ��������
	private String comment;
	// ���ֿͻ�����������
	private String customerName;
	// ���ֿͻ�ID
	private String customerID;
	// ���۶�Ӧ�Ƶ�����
	private String hotelName;
	// ���۶�Ӧ�Ƶ�ID
	private String hotelID;
	// ���۶�Ӧ������
	private String orderID;
	// ����ʱ��
	private Date commentTime;

	public CommentPO() {
	}

	public CommentPO(double score, String comment, String customerName, String customerID, String hotelName, String hotelID,
			String orderID, Date commentTime) {
		this.score = score;
		this.comment = comment;
		this.customerName = customerName;
		this.customerID=customerID;
		this.hotelName = hotelName;
		this.hotelID = hotelID;
		this.orderID = orderID;
		this.commentTime = commentTime;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerID(){
		return customerID;
	}

	public void setCustomerID(String customerID){
		this.customerID=customerID;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

}
