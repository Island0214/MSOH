package po;

import java.awt.Image;
import java.io.Serializable;
import util.MemberType;
/**
 * 
 * @author �L�ߺ�
 *
 */
public class CustomerPO implements Serializable {
	// �û���
	private String userName;
	// �û�����
	private String password;
	// �û��ֻ���
	private String phone;
	// �û������˺�
	private String email;
	// �û�����ֵ
	private int credit;
	// �û�ͷ��
	private Image picture;
	// �û����֤��
	private String ID;
	// ��Ա����
	private MemberType memberType;

	public CustomerPO() {
	}

	public CustomerPO(String userName, String password, String phone, String email, int credit, Image picture,
			String ID,MemberType memberType) {
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.credit = credit;
		this.picture = picture;
		this.ID = ID;
		this.memberType=memberType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public String getID() {
		return ID;
	}
	
	public void setID(String ID){
		this.ID=ID;
	}
	
	public MemberType getMemberType(){
		return memberType;
	}
	
	public void setMemberType(MemberType memberType){
		this.memberType=memberType;
	}
}
