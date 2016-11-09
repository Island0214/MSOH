package vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author �L�ߺ� 2016-10-15 15:09:28
 *
 */
public class DailyRoomInfoVO implements Serializable{

	public String hotelID;

	public Date date;

	public List<RoomVO> room;

	public DailyRoomInfoVO() {
	}

	public DailyRoomInfoVO(String hotelID, Date date, List<RoomVO> room) {
		this.hotelID = hotelID;
		this.date = date;
		this.room = room;
	}
}
