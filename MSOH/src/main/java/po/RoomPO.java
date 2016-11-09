package po;

import java.io.Serializable;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class RoomPO implements Serializable {
	// �Ƶ�ID
	private String hotelID;
	// ��������
	private String roomType;
	// ����ס��������
	private int occupiedRooms;
	// ��Ԥ����������
	private int reservedRooms;
	// ʣ��շ�����
	private int leftRooms;
	// ����۸�
	private double price;

	public RoomPO() {
	}

	public RoomPO(String hotelID, String roomType, int occupiedRooms, int reservedRooms, int leftRooms, double price) {
		this.hotelID = hotelID;
		this.roomType = roomType;
		this.occupiedRooms = occupiedRooms;
		this.reservedRooms = reservedRooms;
		this.leftRooms = leftRooms;
		this.price = price;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getOccupiedRooms() {
		return occupiedRooms;
	}

	public void setOccupiedRooms(int occupiedRooms) {
		this.occupiedRooms = occupiedRooms;
	}

	public int getReservedRooms() {
		return reservedRooms;
	}

	public void setReservedRooms(int reservedRooms) {
		this.reservedRooms = reservedRooms;
	}

	public int getLeftRooms() {
		return leftRooms;
	}

	public void setLeftRooms(int leftRooms) {
		this.leftRooms = leftRooms;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
