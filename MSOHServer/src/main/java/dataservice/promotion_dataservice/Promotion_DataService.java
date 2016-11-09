package dataservice.promotion_dataservice;

import java.util.Date;
import java.util.List;

import po.HotelPO;
import po.PromotionPO;
import util.MemberType;
import util.ResultMessage;
/**
 * 
 * @author �X����
 *
 */
public interface Promotion_DataService {
	public ResultMessage add (PromotionPO po);
	
	public String getTargetAera (PromotionPO po);

	public List<String> getTargetHotel (PromotionPO po);
	
	public MemberType getTargetUser (PromotionPO po);
	
	public Date getStartTime (PromotionPO po);
	
	public Date getEndTime (PromotionPO po);
	
	public double getDiscount (PromotionPO po);
	
	public int getMinRoom (PromotionPO po);

}
