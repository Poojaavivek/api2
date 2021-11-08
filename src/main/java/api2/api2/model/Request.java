package api2.api2.model;

import java.util.Date;


public class Request {
	private Long reqUserid;
	private String reqName;
	private Date reqDob;
	private String reqEmail;
	private String reqMobile;
	
	@Override
	public String toString() {
		return "Request [reqUserid=" + reqUserid + ", reqName=" + reqName + ", reqDob=" + reqDob + ", reqEmail="
				+ reqEmail + ", reqMobile=" + reqMobile + "]";
	}
	public Long getReqUserid() {
		return reqUserid;
	}
	public void setReqUserid(Long reqUserid) {
		this.reqUserid = reqUserid;
	}
	public String getReqName() {
		return reqName;
	}
	public void setReqName(String reqName) {
		this.reqName = reqName;
	}
	public Date getReqDob() {
		return reqDob;
	}
	public void setReqDob(Date reqDob) {
		this.reqDob = reqDob;
	}
	public String getReqEmail() {
		return reqEmail;
	}
	public void setReqEmail(String reqEmail) {
		this.reqEmail = reqEmail;
	}
	public String getReqMobile() {
		return reqMobile;
	}
	public void setReqMobile(String reqMobile) {
		this.reqMobile = reqMobile;
	}
}
