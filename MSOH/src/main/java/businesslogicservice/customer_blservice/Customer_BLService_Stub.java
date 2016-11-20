package businesslogicservice.customer_blservice;

import java.util.ArrayList;
import java.util.List;

import util.ResultMessage;
import vo.CreditRecordVO;
import vo.CustomerVO;
import vo.HotelVO;

/**
 * 
 * @author ST 2016/10/15
 *
 */

public class Customer_BLService_Stub implements Customer_BLService {

	CustomerVO customerVO;
	CreditRecordVO creditRecordVO;
	HotelVO hotelVO;
	List<HotelVO> list;

	/**
	 * �ͻ�ע��
	 */
	public ResultMessage signUp(CustomerVO vo) {
		// TODO Auto-generated method stub
		if (vo.ID.equals("000000000000000000")) {
			// �����֤���Ѵ���
			return ResultMessage.Customer_SignupExist;
		} else if (vo.email == "" || vo.ID == "" || vo.password == "" || vo.phone == "" || vo.name == "") {
			// ��ĳ��δ��д
			return ResultMessage.Blank;
		} else if (vo.phone.length() != 11) {
			// �ֻ������ʽ����
			return ResultMessage.WrongPhoneFormat;
		} else if (vo.ID.length() != 18) {
			// ���֤�Ÿ�ʽ����
			return ResultMessage.WrongIDFormat;
		} else if (!vo.email.contains("@")) {
			// �����ʽ����
			return ResultMessage.WrongEmailFormat;
		} else {
			// ע��ɹ�
			return ResultMessage.Customer_SignupSuccess;
		}
	}

	/**
	 * �ͻ�ά��������Ϣ
	 */
	public ResultMessage changeInfo(CustomerVO vo) {
		// TODO Auto-generated method stub
		if (vo.email == "" || vo.ID == "" || vo.password == "" || vo.phone == "" || vo.name == "") {
			// ��ĳ��δ��д
			return ResultMessage.Blank;
		} else if (vo.phone.length() != 11) {
			// �ֻ������ʽ����
			return ResultMessage.WrongPhoneFormat;
		} else if (!vo.email.contains("@")) {
			// �����ʽ����
			return ResultMessage.WrongEmailFormat;
		} else {
			// �޸ĳɹ�
			return ResultMessage.ChangeInfoSuccess;
		}
	}

	/**
	 * �ͻ��޸�����
	 */
	public ResultMessage changePassword(String ID, String oldPw, String newPw1, String newPw2) {
		if (!oldPw.equals(customerVO.password)) {
			// ���������
			return ResultMessage.ChangePasswordWrongOldPw;
		} else if (oldPw.equals(customerVO.password) && !newPw1.equals(newPw2)) {
			// ���������벻һ��
			return ResultMessage.ChangePassword2DifferentNew;
		} else

		{
			// �޸�����ɹ�
			return ResultMessage.ChangePasswordSuccess;
		}
	}



	/**
	 * �鿴�ͻ����ü�¼
	 */
	public CreditRecordVO getCreditRecord(String ID) {
		// TODO Auto-generated method stub
		return creditRecordVO;
	}

	/**
	 * ����Ԥ�����ľƵ�
	 */
	public List<HotelVO> getHistoryHotel(String ID) {
		// TODO Auto-generated method stub
		return list;
	}

	public double getCredit(String ID) {
		return 0;
	}

	public ResultMessage addCreditRecord(String ID, CreditRecordVO creditRecordVO) {
		return null;
	}

}
