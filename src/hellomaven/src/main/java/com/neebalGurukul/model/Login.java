package com.neebalGurukul.model;

import java.sql.Date;

public class Login {
	private int id;
	private String uName;
	private String pswd;
	private Date lastModified;
	private boolean active;
	
	public int getId() {
		return id;
	}
	
	public String getuName() {
		return uName;
	}
	
	public String getPswd() {
		return pswd;
	}
	
	public Date getLastModified() {
		return lastModified;
	}
	
	public boolean isActive() {
		return active;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", uName=" + uName + ", pswd=" + pswd + ", lastModified=" + lastModified
				+ ", active=" + active + "]";
	}
	
	
	
	
	
}
