package dataservice.customer_dataservice;

import java.util.List;

import po.CustomerPO;
import po.HotelPO;
import util.ResultMessage;
/**
 * 
 * @author �X����
 *
 */
public interface Customer_DataService {
	
	public ResultMessage add(CustomerPO customerPO);
	
	public ResultMessage modify(CustomerPO customerPO);
	
	public List<CustomerPO> find(String id);	
	
	public String getID (CustomerPO customerPO);
	
	public int getCurrentCredit (String customer_id);
	
	public List<HotelPO> getReservedHotel(CustomerPO customerPO);
}
