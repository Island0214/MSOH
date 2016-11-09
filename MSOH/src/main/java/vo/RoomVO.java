package vo;

import java.io.Serializable;

/**
 * 
 * @author �L�ߺ� 2016-10-15 15:12:17
 *
 */
public class RoomVO implements Serializable{

	public String hotelID;

	public String roomType;

	public int occupiedRooms;

	public int reservedRooms;

	public int leftRooms;

	public double price;

	public RoomVO() {
	}

	public RoomVO(String hotelID, String roomType, int occupiedRooms, int reservedRooms, int leftRooms, double price) {
		this.hotelID = hotelID;
		this.roomType = roomType;
		this.occupiedRooms = occupiedRooms;
		this.reservedRooms = reservedRooms;
		this.leftRooms = leftRooms;
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}

}
