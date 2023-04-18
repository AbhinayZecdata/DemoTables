package com.example.demo.enitiy;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class dealer_tm_mapping_table {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String createdby;
	private LocalDateTime createdon;
	private String isactve;
	private String modifiedby;
	private LocalDateTime modifiedon;
	private String kunnr;
	private String parvw;
	private String pernr;
	private String spart;
	private String vkorg;
	private String vtweg;
	private String PARZA;
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
	public String getKunnr() {
		return kunnr;
	}
	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}
	public String getParvw() {
		return parvw;
	}
	public void setParvw(String parvw) {
		this.parvw = parvw;
	}
	public String getPernr() {
		return pernr;
	}
	public void setPernr(String pernr) {
		this.pernr = pernr;
	}
	public String getSpart() {
		return spart;
	}
	public void setSpart(String spart) {
		this.spart = spart;
	}
	public String getVkorg() {
		return vkorg;
	}
	public void setVkorg(String vkorg) {
		this.vkorg = vkorg;
	}
	public String getVtweg() {
		return vtweg;
	}
	public void setVtweg(String vtweg) {
		this.vtweg = vtweg;
	}
	public String getPARZA() {
		return PARZA;
	}
	public void setPARZA(String pARZA) {
		PARZA = pARZA;
	}
	
	

}
