package com.rent.model;

import java.util.Date;

/**
 * 租客信息
 * @author chivas
 *
 */
public class RentPerson {
	
	/**租客信息主键**/
	private Long rpKey;
	/**租客姓名**/
	private String rpName;
	/**租客电话**/
	private String rpPhone;
	/**租客身份证**/
	private String rpId;
	/**租客身份证地址**/
	private String rpDistrict;
	/**租客银行卡**/
	private String rpCard;
	/**银行卡银行**/
	private String rpCardBank;
	/**租客所租房间号码**/
	private Integer rhId;
	
	private Integer status;
	private Date createDate;
	private Date lastUpdateDate;
	
	public Long getRpKey() {
		return rpKey;
	}
	public void setRpKey(Long rpKey) {
		this.rpKey = rpKey;
	}
	public String getRpName() {
		return rpName;
	}
	public void setRpName(String rpName) {
		this.rpName = rpName;
	}
	public String getRpPhone() {
		return rpPhone;
	}
	public void setRpPhone(String rpPhone) {
		this.rpPhone = rpPhone;
	}
	public String getRpId() {
		return rpId;
	}
	public void setRpId(String rpId) {
		this.rpId = rpId;
	}
	public String getRpDistrict() {
		return rpDistrict;
	}
	public void setRpDistrict(String rpDistrict) {
		this.rpDistrict = rpDistrict;
	}
	public String getRpCard() {
		return rpCard;
	}
	public void setRpCard(String rpCard) {
		this.rpCard = rpCard;
	}
	public String getRpCardBank() {
		return rpCardBank;
	}
	public void setRpCardBank(String rpCardBank) {
		this.rpCardBank = rpCardBank;
	}
	public Integer getRhId() {
		return rhId;
	}
	public void setRhId(Integer rhId) {
		this.rhId = rhId;
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
	
	
}
