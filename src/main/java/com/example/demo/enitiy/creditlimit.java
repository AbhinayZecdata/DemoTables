package com.example.demo.enitiy;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class creditlimit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String createdby;
	private LocalDateTime createdon;
	private String isactve;
	private String modifiedby;
	private LocalDateTime modifiedon;
	private String creditlimit;
	private String klimk;
	private String knkli;
	private String kunnr;
	private String oblig;
	private String sauft;
	private String skfor;
	private String ssobl;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public LocalDateTime getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
	public String getIsactve() {
		return isactve;
	}
	public void setIsactve(String isactve) {
		this.isactve = isactve;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public LocalDateTime getModifiedon() {
		return modifiedon;
	}
	public void setModifiedon(LocalDateTime modifiedon) {
		this.modifiedon = modifiedon;
	}
	public String getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(String creditlimit) {
		this.creditlimit = creditlimit;
	}
	public String getKlimk() {
		return klimk;
	}
	public void setKlimk(String klimk) {
		this.klimk = klimk;
	}
	public String getKnkli() {
		return knkli;
	}
	public void setKnkli(String knkli) {
		this.knkli = knkli;
	}
	public String getKunnr() {
		return kunnr;
	}
	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}
	public String getOblig() {
		return oblig;
	}
	public void setOblig(String oblig) {
		this.oblig = oblig;
	}
	public String getSauft() {
		return sauft;
	}
	public void setSauft(String sauft) {
		this.sauft = sauft;
	}
	public String getSkfor() {
		return skfor;
	}
	public void setSkfor(String skfor) {
		this.skfor = skfor;
	}
	public String getSsobl() {
		return ssobl;
	}
	public void setSsobl(String ssobl) {
		this.ssobl = ssobl;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	private String loginID;
	
	


}
