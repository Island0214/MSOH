package po;

import java.io.Serializable;
import java.util.Date;

import util.MemberType;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class MemberPO implements Serializable {
	// �û�ID
	private String ID;
	// ��Ա����
	private MemberType memberType;
	// ��Ա�ȼ�
	private int level;
	// ��ͨ��Ա����
	private Date birthday;
	// ��ҵ��Ա��ҵ����
	private String companyName;

	public MemberPO() {
	}

	public MemberPO(String ID, MemberType memberType, int level, Date birthday, String companyName) {
		this.ID = ID;
		this.memberType = memberType;
		this.level = level;
		this.birthday = birthday;
		this.companyName = companyName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID){
		this.ID=ID;
	}
	
	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
