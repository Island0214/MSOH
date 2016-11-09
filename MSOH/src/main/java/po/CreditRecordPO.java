package po;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class CreditRecordPO implements Serializable {
	// ���ñ仯ֵ
	private int variation;
	// ����ʱ��
	private Date changeTime;
	// �ͻ�����������
	private String customerName;
	// �ͻ�ID
	private String customerID;
	// ���ĺ�����ֵ
	private int afterChangeCredit;
	// ������
	private String orderID;
	// Ӫ����Ա����
	private String marketerName;

	public CreditRecordPO() {
	}

	public CreditRecordPO(int variation, Date changeTime, String customerName, String customerID, int afterChangeCredit, String orderID,
			String marketerName) {
		this.variation = variation;
		this.changeTime = changeTime;
		this.customerName = customerName;
		this.customerID=customerID;
		this.afterChangeCredit = afterChangeCredit;
		this.orderID = orderID;
		this.marketerName = marketerName;
	}

	public int getVariation() {
		return variation;
	}

	public void setVariation(int variation) {
		this.variation = variation;
	}

	public Date getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
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
	
	public int getAfterChangeCredit() {
		return afterChangeCredit;
	}

	public void setAfterChangeCredit(int afterChangeCredit) {
		this.afterChangeCredit = afterChangeCredit;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getMarketerName() {
		return marketerName;
	}

	public void setMarketerName(String marketerName) {
		this.marketerName = marketerName;
	}

}
