package po;

import java.awt.Image;
import java.io.Serializable;
import java.util.List;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class HotelPO implements Serializable {
	// �Ƶ�����
	private String hotelName;
	// �Ƶ��ַ
	private String hotelAddress;
	// �Ƶ�������Ȧ
	private String area;
	// ���
	private String intro;
	// ��ʩ����
	private List<String> infra;
	// �Ƶ��Ǽ�
	private int star;
	// �Ƶ�����
	private double score;
	// ��Ӫ���֤��
	private String license;
	// �Ƶ�ͼƬ
	private List<Image> pics;
	// ϵͳ�иþƵ깤����Ա������
	private String clerkName;
	// ϵͳ�иþƵ깤����Ա���ֻ���
	private String clerkPhone;
	// �Ƶ�ID
	private String hotelID;
	// ���ɸ�DailyRoomInfoPO
	private List<DailyRoomInfoPO> dailyRoomInfo;
	// ���ɸ�����PO
	private List<CommentPO> comment;

	public HotelPO() {
	}

	public HotelPO(String hotelName, String hotelAddress, String area, String intro, List<String> infra, int star,
			double score, String license, String clerkName, String clerkPhone, String hotelID, List<DailyRoomInfoPO> dailyRoomInfo,
			List<CommentPO> comment) {
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.area = area;
		this.intro = intro;
		this.infra = infra;
		this.star = star;
		this.score = score;
		this.license = license;
		this.clerkName = clerkName;
		this.clerkPhone = clerkPhone;
		this.hotelID = hotelID;
		this.dailyRoomInfo = dailyRoomInfo;
		this.comment = comment;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public List<String> getInfra() {
		return infra;
	}

	public void setInfra(List<String> infra) {
		this.infra = infra;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getClerkPhone() {
		return clerkPhone;
	}

	public void setClerkPhone(String clerkPhone) {
		this.clerkPhone = clerkPhone;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public List<DailyRoomInfoPO> getDailyRoomInfo() {
		return dailyRoomInfo;
	}

	public void setRoom(List<DailyRoomInfoPO> dailyRoomInfo) {
		this.dailyRoomInfo = dailyRoomInfo;
	}

	public List<CommentPO> getComment() {
		return comment;
	}

	public void setComment(List<CommentPO> comment) {
		this.comment = comment;
	}

}
