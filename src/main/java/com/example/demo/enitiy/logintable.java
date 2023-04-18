package com.example.demo.enitiy;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class logintable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginID;
	private String userID;
	private String userpass;
	private String userfname;
	private String userlname;
	private String useraddress;
	private int userage;
	private String userrole;
	private String userqualification;
	private String isactive;
	private String attr_1;
	private String attr_2;
	private String attr_3;
	private String attr_4;
	private String attr_5;
	private String createdby;
	private LocalDateTime createddate;
	private String modifiedby;
	private LocalDateTime modifieddate;
	private String usertype;
	private long  business_id;
	private String plant;
	private String regio;
	private int accountNonLocked;
	private String email_id;
	private int is_email_sent;
	private int is_sms_sent;
	private String mobile_no;
	private int userAttempts;
	private String sales_org;
	private String empEmail;
	private String empMgrEmail;
	private String empMgrId;
	private String empMgrName;
	private String empMobile;
	private String managerId;
	private String scheme;
	public int getLoginID() {
		return loginID;
	}
	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUserfname() {
		return userfname;
	}
	public void setUserfname(String userfname) {
		this.userfname = userfname;
	}
	public String getUserlname() {
		return userlname;
	}
	public void setUserlname(String userlname) {
		this.userlname = userlname;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public String getUserqualification() {
		return userqualification;
	}
	public void setUserqualification(String userqualification) {
		this.userqualification = userqualification;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getAttr_1() {
		return attr_1;
	}
	public void setAttr_1(String attr_1) {
		this.attr_1 = attr_1;
	}
	public String getAttr_2() {
		return attr_2;
	}
	public void setAttr_2(String attr_2) {
		this.attr_2 = attr_2;
	}
	public String getAttr_3() {
		return attr_3;
	}
	public void setAttr_3(String attr_3) {
		this.attr_3 = attr_3;
	}
	public String getAttr_4() {
		return attr_4;
	}
	public void setAttr_4(String attr_4) {
		this.attr_4 = attr_4;
	}
	public String getAttr_5() {
		return attr_5;
	}
	public void setAttr_5(String attr_5) {
		this.attr_5 = attr_5;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public LocalDateTime getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDateTime createddate) {
		this.createddate = createddate;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public LocalDateTime getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(LocalDateTime modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public long getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(long business_id) {
		this.business_id = business_id;
	}
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public String getRegio() {
		return regio;
	}
	public void setRegio(String regio) {
		this.regio = regio;
	}
	public int getAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(int accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getIs_email_sent() {
		return is_email_sent;
	}
	public void setIs_email_sent(int is_email_sent) {
		this.is_email_sent = is_email_sent;
	}
	public int getIs_sms_sent() {
		return is_sms_sent;
	}
	public void setIs_sms_sent(int is_sms_sent) {
		this.is_sms_sent = is_sms_sent;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public int getUserAttempts() {
		return userAttempts;
	}
	public void setUserAttempts(int userAttempts) {
		this.userAttempts = userAttempts;
	}
	public String getSales_org() {
		return sales_org;
	}
	public void setSales_org(String sales_org) {
		this.sales_org = sales_org;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMgrEmail() {
		return empMgrEmail;
	}
	public void setEmpMgrEmail(String empMgrEmail) {
		this.empMgrEmail = empMgrEmail;
	}
	public String getEmpMgrId() {
		return empMgrId;
	}
	public void setEmpMgrId(String empMgrId) {
		this.empMgrId = empMgrId;
	}
	public String getEmpMgrName() {
		return empMgrName;
	}
	public void setEmpMgrName(String empMgrName) {
		this.empMgrName = empMgrName;
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
}
