package vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author �L�ߺ� 2016-10-15 15:10:19
 *
 */
public class CreditRecordVO implements Serializable{

	public int variation;

	public Date changeTime;

	public String customerName;
	
	public String customerID;

	public int afterChangeCredit;

	public String orderID;

	public String marketerName;

	public CreditRecordVO() {
	}

	public CreditRecordVO(int variation, Date changeTime, String customerName, String customerID, int afterChangeCredit, String orderID,
			String marketerName) {
		this.variation = variation;
		this.changeTime = changeTime;
		this.customerName = customerName;
		this.customerID=customerID;
		this.afterChangeCredit = afterChangeCredit;
		this.orderID = orderID;
		this.marketerName = marketerName;
	}
}
