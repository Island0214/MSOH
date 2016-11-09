package po;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class MemberLevelPO implements Serializable{
	//�ƶ�������
	private String framerName;
	//�ƶ�����
	private Date frameDate;
	//��Ա����
	private int num;
	//��Ա����ֵ����
	private int[] creditBoundaries;
	
	public MemberLevelPO(){
	}
	
	public MemberLevelPO(String framerName, Date frameDate, int num, int[] creditBoundaries){
		this.framerName=framerName;
		this.frameDate=frameDate;
		this.num=num;
		this.creditBoundaries=creditBoundaries;
	}

	public String getFramerName() {
		return framerName;
	}

	public void setFramerName(String framerName) {
		this.framerName = framerName;
	}

	public Date getFrameDate() {
		return frameDate;
	}

	public void setFrameDate(Date frameDate) {
		this.frameDate = frameDate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getCreditBoundaries() {
		return creditBoundaries;
	}

	public void setCreditBoundaries(int[] creditBoundaries) {
		this.creditBoundaries = creditBoundaries;
	}
	
	
}
