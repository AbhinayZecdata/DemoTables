package com.example.demo.enitiy;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class header_table {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int HeaderID;
	private String KUNNR;
	private String VKORG;
	private String VTWEG;
	private String SPART;
	private String VKGRP;
	private String VKBUR;
	private float NETWR;
	private float CREDITLIMIT;
	private String FLAG;
	private String STATUS;
	private LocalDateTime ERDAT;
	private LocalDateTime AEDAT;
	private String sync;
	private LocalDateTime headerInsertionTime;
	private LocalDateTime updateHeaderTime;
	private String comments;
	private String reference_no;
	private String retailer_comments;
	private String approved_By;
	private String SAP_Flag;
	private String SAP_VBELN;
	private String approverId;
	private String bearerToken;
	private String BMFlag;
	private String BMRemarks;
	public int getHeaderID() {
		return HeaderID;
	}
	public void setHeaderID(int headerID) {
		HeaderID = headerID;
	}
	public String getKUNNR() {
		return KUNNR;
	}
	public void setKUNNR(String kUNNR) {
		KUNNR = kUNNR;
	}
	public String getVKORG() {
		return VKORG;
	}
	public void setVKORG(String vKORG) {
		VKORG = vKORG;
	}
	public String getVTWEG() {
		return VTWEG;
	}
	public void setVTWEG(String vTWEG) {
		VTWEG = vTWEG;
	}
	public String getSPART() {
		return SPART;
	}
	public void setSPART(String sPART) {
		SPART = sPART;
	}
	public String getVKGRP() {
		return VKGRP;
	}
	public void setVKGRP(String vKGRP) {
		VKGRP = vKGRP;
	}
	public String getVKBUR() {
		return VKBUR;
	}
	public void setVKBUR(String vKBUR) {
		VKBUR = vKBUR;
	}
	public float getNETWR() {
		return NETWR;
	}
	public void setNETWR(float nETWR) {
		NETWR = nETWR;
	}
	public float getCREDITLIMIT() {
		return CREDITLIMIT;
	}
	public void setCREDITLIMIT(float cREDITLIMIT) {
		CREDITLIMIT = cREDITLIMIT;
	}
	public String getFLAG() {
		return FLAG;
	}
	public void setFLAG(String fLAG) {
		FLAG = fLAG;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public LocalDateTime getERDAT() {
		return ERDAT;
	}
	public void setERDAT(LocalDateTime eRDAT) {
		ERDAT = eRDAT;
	}
	public LocalDateTime getAEDAT() {
		return AEDAT;
	}
	public void setAEDAT(LocalDateTime aEDAT) {
		AEDAT = aEDAT;
	}
	public String getSync() {
		return sync;
	}
	public void setSync(String sync) {
		this.sync = sync;
	}
	public LocalDateTime getHeaderInsertionTime() {
		return headerInsertionTime;
	}
	public void setHeaderInsertionTime(LocalDateTime headerInsertionTime) {
		this.headerInsertionTime = headerInsertionTime;
	}
	public LocalDateTime getUpdateHeaderTime() {
		return updateHeaderTime;
	}
	public void setUpdateHeaderTime(LocalDateTime updateHeaderTime) {
		this.updateHeaderTime = updateHeaderTime;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getReference_no() {
		return reference_no;
	}
	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}
	public String getRetailer_comments() {
		return retailer_comments;
	}
	public void setRetailer_comments(String retailer_comments) {
		this.retailer_comments = retailer_comments;
	}
	public String getApproved_By() {
		return approved_By;
	}
	public void setApproved_By(String approved_By) {
		this.approved_By = approved_By;
	}
	public String getSAP_Flag() {
		return SAP_Flag;
	}
	public void setSAP_Flag(String sAP_Flag) {
		SAP_Flag = sAP_Flag;
	}
	public String getSAP_VBELN() {
		return SAP_VBELN;
	}
	public void setSAP_VBELN(String sAP_VBELN) {
		SAP_VBELN = sAP_VBELN;
	}
	public String getApproverId() {
		return approverId;
	}
	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}
	public String getBearerToken() {
		return bearerToken;
	}
	public void setBearerToken(String bearerToken) {
		this.bearerToken = bearerToken;
	}
	public String getBMFlag() {
		return BMFlag;
	}
	public void setBMFlag(String bMFlag) {
		BMFlag = bMFlag;
	}
	public String getBMRemarks() {
		return BMRemarks;
	}
	public void setBMRemarks(String bMRemarks) {
		BMRemarks = bMRemarks;
	}

}
