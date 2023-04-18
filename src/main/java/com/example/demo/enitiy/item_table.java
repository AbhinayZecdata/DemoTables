package com.example.demo.enitiy;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.aspectj.apache.bcel.generic.LOOKUPSWITCH;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class item_table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ItemID;
	private BigInteger AMENG;
	private String EDATU;
	private LocalDateTime ERDAT;
	private String FLAG;
	private String LGORT;
	private String MAKTX;
	private String MATNR;
	private BigInteger NETPR;
	private BigInteger NETWR_ITEM;
	private long POSNR;
	private String WERKS;
	private String ZIEME;
	private BigInteger ZMENG;
	private long header_ID;
	private LocalDateTime itemInsertionTime;
	private String itemNumber;
	private BigInteger ordered_qty;
	private LocalDateTime updateItemTime;
	public long getItemID() {
		return ItemID;
	}
	public void setItemID(long itemID) {
		ItemID = itemID;
	}
	public BigInteger getAMENG() {
		return AMENG;
	}
	public void setAMENG(BigInteger aMENG) {
		AMENG = aMENG;
	}
	public String getEDATU() {
		return EDATU;
	}
	public void setEDATU(String eDATU) {
		EDATU = eDATU;
	}
	public LocalDateTime getERDAT() {
		return ERDAT;
	}
	public void setERDAT(LocalDateTime eRDAT) {
		ERDAT = eRDAT;
	}
	public String getFLAG() {
		return FLAG;
	}
	public void setFLAG(String fLAG) {
		FLAG = fLAG;
	}
	public String getLGORT() {
		return LGORT;
	}
	public void setLGORT(String lGORT) {
		LGORT = lGORT;
	}
	public String getMAKTX() {
		return MAKTX;
	}
	public void setMAKTX(String mAKTX) {
		MAKTX = mAKTX;
	}
	public String getMATNR() {
		return MATNR;
	}
	public void setMATNR(String mATNR) {
		MATNR = mATNR;
	}
	public BigInteger getNETPR() {
		return NETPR;
	}
	public void setNETPR(BigInteger nETPR) {
		NETPR = nETPR;
	}
	public BigInteger getNETWR_ITEM() {
		return NETWR_ITEM;
	}
	public void setNETWR_ITEM(BigInteger nETWR_ITEM) {
		NETWR_ITEM = nETWR_ITEM;
	}
	public long getPOSNR() {
		return POSNR;
	}
	public void setPOSNR(long pOSNR) {
		POSNR = pOSNR;
	}
	public String getWERKS() {
		return WERKS;
	}
	public void setWERKS(String wERKS) {
		WERKS = wERKS;
	}
	public String getZIEME() {
		return ZIEME;
	}
	public void setZIEME(String zIEME) {
		ZIEME = zIEME;
	}
	public BigInteger getZMENG() {
		return ZMENG;
	}
	public void setZMENG(BigInteger zMENG) {
		ZMENG = zMENG;
	}
	public long getHeader_ID() {
		return header_ID;
	}
	public void setHeader_ID(long header_ID) {
		this.header_ID = header_ID;
	}
	public LocalDateTime getItemInsertionTime() {
		return itemInsertionTime;
	}
	public void setItemInsertionTime(LocalDateTime itemInsertionTime) {
		this.itemInsertionTime = itemInsertionTime;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public BigInteger getOrdered_qty() {
		return ordered_qty;
	}
	public void setOrdered_qty(BigInteger ordered_qty) {
		this.ordered_qty = ordered_qty;
	}
	public LocalDateTime getUpdateItemTime() {
		return updateItemTime;
	}
	public void setUpdateItemTime(LocalDateTime updateItemTime) {
		this.updateItemTime = updateItemTime;
	}
	
	
}
