package com.yungou.o2o.center.manager.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3196218570940188555L;

	
	private List<OrderTicket> orderTicketList ; 
	
	
 	public List<OrderTicket> getOrderTicketList() {
		return orderTicketList;
	}

	public void setOrderTicketList(List<OrderTicket> orderTicketList) {
		this.orderTicketList = orderTicketList;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.Id:���
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.activity_id: �ID
     *
     * @mbggenerated
     */
    private String activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.create_time:����ʱ��
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.member_id: ��ԱID
     *
     * @mbggenerated
     */
    private String memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.member_account: ��Ա�˺�
     *
     * @mbggenerated
     */
    private String memberAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.draw_num:�����˴� 
     *
     * @mbggenerated
     */
    private Integer drawNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.draw_ip: �齱IP
     *
     * @mbggenerated
     */
    private String drawIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.draw_source:�齱��Դ  1PC 2�ֻ� 3 ƽ��
     *
     * @mbggenerated
     */
    private Integer drawSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_type:֧����ʽ  1��� 2�˺���� 3 ����֧��
     *
     * @mbggenerated
     */
    private Integer payType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_name: ֧�����
     *
     * @mbggenerated
     */
    private String payName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_desc: ֧������
     *
     * @mbggenerated
     */
    private String payDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_id: ֧������
     *
     * @mbggenerated
     */
    private String payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_time:֧��ʱ��
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.status:����״̬ 1���н� 2δ�н�
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.delivery_status:����״̬ 1 δ���� 2�ѷ���
     *
     * @mbggenerated
     */
    private Integer deliveryStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.draw_value: �齱ʱ��ֵ
     *
     * @mbggenerated
     */
    private Integer drawValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.Id
     *
     * @return the value of order_info.Id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.Id
     *
     * @param id the value for order_info.Id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.activity_id
     *
     * @return the value of order_info.activity_id
     *
     * @mbggenerated
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.activity_id
     *
     * @param activityId the value for order_info.activity_id
     *
     * @mbggenerated
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.create_time
     *
     * @return the value of order_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.create_time
     *
     * @param createTime the value for order_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.member_id
     *
     * @return the value of order_info.member_id
     *
     * @mbggenerated
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.member_id
     *
     * @param memberId the value for order_info.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.member_account
     *
     * @return the value of order_info.member_account
     *
     * @mbggenerated
     */
    public String getMemberAccount() {
        return memberAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.member_account
     *
     * @param memberAccount the value for order_info.member_account
     *
     * @mbggenerated
     */
    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount == null ? null : memberAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.draw_num
     *
     * @return the value of order_info.draw_num
     *
     * @mbggenerated
     */
    public Integer getDrawNum() {
        return drawNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.draw_num
     *
     * @param drawNum the value for order_info.draw_num
     *
     * @mbggenerated
     */
    public void setDrawNum(Integer drawNum) {
        this.drawNum = drawNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.draw_ip
     *
     * @return the value of order_info.draw_ip
     *
     * @mbggenerated
     */
    public String getDrawIp() {
        return drawIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.draw_ip
     *
     * @param drawIp the value for order_info.draw_ip
     *
     * @mbggenerated
     */
    public void setDrawIp(String drawIp) {
        this.drawIp = drawIp == null ? null : drawIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.draw_source
     *
     * @return the value of order_info.draw_source
     *
     * @mbggenerated
     */
    public Integer getDrawSource() {
        return drawSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.draw_source
     *
     * @param drawSource the value for order_info.draw_source
     *
     * @mbggenerated
     */
    public void setDrawSource(Integer drawSource) {
        this.drawSource = drawSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_type
     *
     * @return the value of order_info.pay_type
     *
     * @mbggenerated
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_type
     *
     * @param payType the value for order_info.pay_type
     *
     * @mbggenerated
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_name
     *
     * @return the value of order_info.pay_name
     *
     * @mbggenerated
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_name
     *
     * @param payName the value for order_info.pay_name
     *
     * @mbggenerated
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_desc
     *
     * @return the value of order_info.pay_desc
     *
     * @mbggenerated
     */
    public String getPayDesc() {
        return payDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_desc
     *
     * @param payDesc the value for order_info.pay_desc
     *
     * @mbggenerated
     */
    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc == null ? null : payDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_id
     *
     * @return the value of order_info.pay_id
     *
     * @mbggenerated
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_id
     *
     * @param payId the value for order_info.pay_id
     *
     * @mbggenerated
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_time
     *
     * @return the value of order_info.pay_time
     *
     * @mbggenerated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_time
     *
     * @param payTime the value for order_info.pay_time
     *
     * @mbggenerated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.status
     *
     * @return the value of order_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.status
     *
     * @param status the value for order_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.delivery_status
     *
     * @return the value of order_info.delivery_status
     *
     * @mbggenerated
     */
    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.delivery_status
     *
     * @param deliveryStatus the value for order_info.delivery_status
     *
     * @mbggenerated
     */
    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.draw_value
     *
     * @return the value of order_info.draw_value
     *
     * @mbggenerated
     */
    public Integer getDrawValue() {
        return drawValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.draw_value
     *
     * @param drawValue the value for order_info.draw_value
     *
     * @mbggenerated
     */
    public void setDrawValue(Integer drawValue) {
        this.drawValue = drawValue;
    }
}