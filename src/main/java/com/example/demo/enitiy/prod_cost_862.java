package com.example.demo.enitiy;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class prod_cost_862 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String createdby;
	private LocalDateTime createdon;
	private String isactive;
	private String modifiedby;
	private LocalDateTime modifiedon;
	private String MESSAGE;
	private String TYPE;
	private double kbetr;
	private String knumh;
	private String konwa;
	private String maktx;
	private String matkl;
	private String matnr;
	private String mtart;
	private long spart;
	private String sync;
	private String unitDesc;
	private String vrkme;
	private String vtext;
	private String werks;
	private long productTypeId;
	private String sales_org;
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
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
	public String getMESSAGE() {
		return MESSAGE;
	}
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public double getKbetr() {
		return kbetr;
	}
	public void setKbetr(double kbetr) {
		this.kbetr = kbetr;
	}
	public String getKnumh() {
		return knumh;
	}
	public void setKnumh(String knumh) {
		this.knumh = knumh;
	}
	public String getKonwa() {
		return konwa;
	}
	public void setKonwa(String konwa) {
		this.konwa = konwa;
	}
	public String getMaktx() {
		return maktx;
	}
	public void setMaktx(String maktx) {
		this.maktx = maktx;
	}
	public String getMatkl() {
		return matkl;
	}
	public void setMatkl(String matkl) {
		this.matkl = matkl;
	}
	public String getMatnr() {
		return matnr;
	}
	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}
	public String getMtart() {
		return mtart;
	}
	public void setMtart(String mtart) {
		this.mtart = mtart;
	}
	public long getSpart() {
		return spart;
	}
	public void setSpart(long spart) {
		this.spart = spart;
	}
	public String getSync() {
		return sync;
	}
	public void setSync(String sync) {
		this.sync = sync;
	}
	public String getUnitDesc() {
		return unitDesc;
	}
	public void setUnitDesc(String unitDesc) {
		this.unitDesc = unitDesc;
	}
	public String getVrkme() {
		return vrkme;
	}
	public void setVrkme(String vrkme) {
		this.vrkme = vrkme;
	}
	public String getVtext() {
		return vtext;
	}
	public void setVtext(String vtext) {
		this.vtext = vtext;
	}
	public String getWerks() {
		return werks;
	}
	public void setWerks(String werks) {
		this.werks = werks;
	}
	public long getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(long productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getSales_org() {
		return sales_org;
	}
	public void setSales_org(String sales_org) {
		this.sales_org = sales_org;
	}
	
	
}
