
import businesslogic.customer_bl.Customer;
import junit.framework.TestCase;
import po.HotelPO;
import util.MemberType;
import util.ResultMessage;
import vo.CommentVO;
import vo.CustomerVO;
import vo.DailyRoomInfoVO;
import vo.HotelVO;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pxr on 16/11/19.
 */
public class CustomerTest extends TestCase {
    Customer customer = new Customer();

    public void getCreditTest() throws RemoteException {
        double credit1 = customer.getCredit("320200000000000000");
        double credit2 = customer.getCredit("123");
        assertEquals(credit1, 10);
        assertEquals(credit2, -1);
    }

    public void signUpTest() throws RemoteException{
        ResultMessage resultMessage1 = customer.signUp(new CustomerVO("pxr", "123456", "12345678910", "123@qq.com", 0, null,
                "320200000000000000", MemberType.NONMEMBER));
        ResultMessage resultMessage2 = customer.signUp(new CustomerVO("pxr", "123456", "12345678910", "123@qq.com", 0, null,
                "320200000000000001", MemberType.NONMEMBER));
        ResultMessage resultMessage3 = customer.signUp(new CustomerVO("", "123456", "12345678910", "123@qq.com", 0, null,
                "320200000000000000", MemberType.NONMEMBER));
        assertEquals(resultMessage1,ResultMessage.Customer_SignupExist);
        assertEquals(resultMessage2,ResultMessage.Customer_SignupSuccess);
        assertEquals(resultMessage3,ResultMessage.Blank);
    }

    public void changeInfoTest()throws RemoteException{
        ResultMessage resultMessage1 = customer.changeInfo(new CustomerVO("pxr", "123456", "12345678910", "123@qq.com", 0, null,
                "320200000000000000", MemberType.NONMEMBER));
        ResultMessage resultMessage2 = customer.changeInfo(new CustomerVO("", "123456", "12345678910", "123@qq.com", 0, null,
                "320200000000000000", MemberType.NONMEMBER));
        assertEquals(resultMessage1,ResultMessage.ChangeInfoSuccess);
        assertEquals(resultMessage2,ResultMessage.Blank);
    }

    public void getHistoryHotelTest()throws RemoteException{
        List<HotelVO> hotelVOList = customer.getHistoryHotel("320200000000000000");
        List<HotelVO> hotelVOList1 = new ArrayList<HotelVO>();
        hotelVOList1.add(new HotelVO("RUJIA", "NJU", "XIANLIN", "wu", null, 5,
                5, "has", "pxr", "12345678910", "123", null, null));
        List<HotelVO> hotelVOList2 = customer.getHistoryHotel("123");
        assertEquals(hotelVOList,hotelVOList1);
        assertEquals(hotelVOList2,null);
    }

    public void changePasswordTest()throws RemoteException{
        ResultMessage resultMessage1 = customer.changePassword("320200000000000000","123456","1234567","1234567");
        ResultMessage resultMessage2 = customer.changePassword("320200000000000000","12345","1234567","1234567");
        ResultMessage resultMessage3 = customer.changePassword("320200000000000000","123456","1234567","123456");
        ResultMessage resultMessage4 = customer.changePassword("","123456","1234567","1234567");

        assertEquals(resultMessage1,ResultMessage.ChangePasswordSuccess);
        assertEquals(resultMessage2,ResultMessage.ChangePasswordWrongOldPw);
        assertEquals(resultMessage3,ResultMessage.ChangePassword2DifferentNew);
        assertEquals(resultMessage4,ResultMessage.Blank);
    }

}