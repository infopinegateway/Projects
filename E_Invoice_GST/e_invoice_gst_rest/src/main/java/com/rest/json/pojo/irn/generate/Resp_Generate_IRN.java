package com.rest.json.pojo.irn.generate;

public class Resp_Generate_IRN {
		
	private String Status;
	private String Data = null;
	private String ErrorDetails;
	private String InfoDtls;
	private float AckNo;
	private String AckDt;
	private String Irn;
	private String SignedInvoice;
	private String SignedQRCode;	
	private float EwbNo;
	private String EwbDt;
	private String EwbValidTill;
	private String Remarks;
	
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getErrorDetails() {
		return ErrorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		ErrorDetails = errorDetails;
	}
	public String getInfoDtls() {
		return InfoDtls;
	}
	public void setInfoDtls(String infoDtls) {
		InfoDtls = infoDtls;
	}
	public float getAckNo() {
		return AckNo;
	}
	public void setAckNo(float ackNo) {
		AckNo = ackNo;
	}
	public String getAckDt() {
		return AckDt;
	}
	public void setAckDt(String ackDt) {
		AckDt = ackDt;
	}
	public String getIrn() {
		return Irn;
	}
	public void setIrn(String irn) {
		Irn = irn;
	}
	public String getSignedInvoice() {
		return SignedInvoice;
	}
	public void setSignedInvoice(String signedInvoice) {
		SignedInvoice = signedInvoice;
	}
	public String getSignedQRCode() {
		return SignedQRCode;
	}
	public void setSignedQRCode(String signedQRCode) {
		SignedQRCode = signedQRCode;
	}
	public float getEwbNo() {
		return EwbNo;
	}
	public void setEwbNo(float ewbNo) {
		EwbNo = ewbNo;
	}
	public String getEwbDt() {
		return EwbDt;
	}
	public void setEwbDt(String ewbDt) {
		EwbDt = ewbDt;
	}
	public String getEwbValidTill() {
		return EwbValidTill;
	}
	public void setEwbValidTill(String ewbValidTill) {
		EwbValidTill = ewbValidTill;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
}
