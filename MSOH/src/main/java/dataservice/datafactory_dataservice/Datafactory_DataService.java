package dataservice.datafactory_dataservice;

import po.CreditRecordPO;
import po.CustomerPO;
import util.ResultMessage;

/**
 * 
 * @author ���ߺ�
 *
 */
public interface Datafactory_DataService {

	public ResultMessage addCredit(CustomerPO customerPO,int increase);
	
	public ResultMessage decreaseCredit(CustomerPO customerPO,int decrease);
	
	public ResultMessage addCreditRecord(CreditRecordPO crPO);
	
}
