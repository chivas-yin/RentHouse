package com.rent.model;

import java.util.Date;

/**
 * 出租房模型
 * @author chivas
 *
 */
public class RentHouse {

	/**出租房主键**/
	private Long rhKey;
	/**出租房编号**/
	private Integer rhId;
	/**出租房地址**/
	private String rhAddress;
	/**出租房面积大小(平方米)**/
	private Integer rhArea;
	/**出租房租金**/
	private Integer rhMoney;
	/**收取租金日期**/
	private Date rhDate;
	/**出租房押金**/
	private Integer rhDeposit;
	/**出租屋描述**/
	private String rhDescribe;
	
	private Integer status;
	private Date createDate;
	private Date lastUpdateDate;
	
	public RentHouse(){}
	
	public RentHouse(Integer rhId,String rhAddress,Integer rhArea,Integer rhMoney,Integer rhDeposit){
		this.rhId = rhId;
		this.rhAddress = rhAddress;
		this.rhArea = rhArea;
		this.rhMoney = rhMoney;
		this.rhDeposit = rhDeposit;
	}
	
	@Override
	public String toString(){
		return String.format("房号%d的地址是%s,房子的面积有%d平方.每月租金%d元,需交押金%d元。", 
							rhId,rhAddress,rhArea,rhMoney,rhDeposit);
	}
	
	public Long getRhKey() {
		return rhKey;
	}
	public void setRhKey(Long rhKey) {
		this.rhKey = rhKey;
	}
	public Integer getRhId() {
		return rhId;
	}
	public void setRhId(Integer rhId) {
		this.rhId = rhId;
	}
	public String getRhAddress() {
		return rhAddress;
	}
	public void setRhAddress(String rhAddress) {
		this.rhAddress = rhAddress;
	}
	public Integer getRhArea() {
		return rhArea;
	}
	public void setRhArea(Integer rhArea) {
		this.rhArea = rhArea;
	}
	public Integer getRhMoney() {
		return rhMoney;
	}
	public void setRhMoney(Integer rhMoney) {
		this.rhMoney = rhMoney;
	}
	public Date getRhDate() {
		return rhDate;
	}
	public void setRhDate(Date rhDate) {
		this.rhDate = rhDate;
	}
	public Integer getRhDeposit() {
		return rhDeposit;
	}
	public void setRhDeposit(Integer rhDeposit) {
		this.rhDeposit = rhDeposit;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getRhDescribe(){
		return this.toString();
	}
	public void setRhDescribe(String rhDescribe){
		this.rhDescribe = rhDescribe;
	}
	
	
}
