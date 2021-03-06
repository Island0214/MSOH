package po;

import util.OrderStatus;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author zqh
 */
public class OrderPO implements Serializable {
    private static final long serialVersionUID = 1L;
    // 数据库自动生成的订单ID，无需使用
    private int _autoID;
    // 订单号
    private String orderID;
    // 客户姓名
    private String customerName;
    // 客户联系方式
    private String phone;
    // 客户ID
    private String customerID;
    // 酒店ID
    private String hotelID;
    // 酒店名称
    private String hotelName;
    // 预计check in时间
    private Timestamp estimatedCheckInTime;
    // 实际check in时间
    private Timestamp actualCheckInTime;
    // 预计check out时间
    private Timestamp estimatedCheckOutTime;
    // 实际check out时间
    private Timestamp actualCheckOutTime;
    // 最晚执行时间
    private Timestamp latestExecutedTime;
    // 所订客房（用分号进行分割，示例：“双床房;双床房;大床房”
    private String rooms;
    // 入住人数
    private int numOfCustomers;
    // 是否有儿童
    private boolean haveChildren;
    // 备注（特殊要求，如：“需要三双拖鞋”）
    private String remarks;
    // 所用策略名称
    private String promotionName;
    // 最初价格
    private double initialPrice;
    // 折后价格
    private double finalPrice;
    // 订单状态
    private OrderStatus orderStatus;
    // 若是撤销的订单，记录撤销时间
    private Timestamp revokedTime;

    public OrderPO() {

    }

    public OrderPO(String customerName, String phone, String customerID, String hotelID, String hotelName,
                   Timestamp estimatedCheckInTime, Timestamp actualCheckInTime, Timestamp estimatedCheckOutTime, Timestamp actualCheckOutTime,
                   Timestamp latestExecutedTime, String rooms, int numOfCustomers, boolean haveChildren, String remarks,
                   String promotionName, double initialPrice, double finalPrice, OrderStatus orderStatus) {
        this.customerName = customerName;
        this.phone = phone;
        this.customerID = customerID;
        this.hotelID = hotelID;
        this.hotelName = hotelName;
        this.estimatedCheckInTime = estimatedCheckInTime;
        this.actualCheckInTime = actualCheckInTime;
        this.estimatedCheckOutTime = estimatedCheckOutTime;
        this.actualCheckOutTime = actualCheckOutTime;
        this.latestExecutedTime = latestExecutedTime;
        this.rooms = rooms;
        this.numOfCustomers = numOfCustomers;
        this.haveChildren = haveChildren;
        this.remarks = remarks;
        this.promotionName = promotionName;
        this.initialPrice = initialPrice;
        this.finalPrice = finalPrice;
        this.orderStatus = orderStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Timestamp getEstimatedCheckInTime() {
        return estimatedCheckInTime;
    }

    public void setEstimatedCheckInTime(Timestamp estimatedCheckInTime) {
        this.estimatedCheckInTime = estimatedCheckInTime;
    }

    public Timestamp getActualCheckInTime() {
        return actualCheckInTime;
    }

    public void setActualCheckInTime(Timestamp actualCheckInTime) {
        this.actualCheckInTime = actualCheckInTime;
    }

    public Timestamp getEstimatedCheckOutTime() {
        return estimatedCheckOutTime;
    }

    public void setEstimatedCheckOutTime(Timestamp estimatedCheckOutTime) {
        this.estimatedCheckOutTime = estimatedCheckOutTime;
    }

    public Timestamp getActualCheckOutTime() {
        return actualCheckOutTime;
    }

    public void setActualCheckOutTime(Timestamp actualCheckOutTime) {
        this.actualCheckOutTime = actualCheckOutTime;
    }

    public Timestamp getLatestExecutedTime() {
        return latestExecutedTime;
    }

    public void setLatestExecutedTime(Timestamp latestExecutedTime) {
        this.latestExecutedTime = latestExecutedTime;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    public void setNumOfCustomers(int numOfCustomers) {
        this.numOfCustomers = numOfCustomers;
    }

    public boolean isHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(boolean haveChildren) {
        this.haveChildren = haveChildren;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public Timestamp getRevokedTime() {
        return revokedTime;
    }

    public void setRevokedTime(Timestamp revokedTime) {
        this.revokedTime = revokedTime;
    }
}