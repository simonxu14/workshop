package com.message;

public class Workshop {
	private String ID;
	private String type;
	private String bTime;
	private String manufacturer;
	private String principal;
	
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getbTime() {
		return bTime;
	}
	public void setbTime(String bTime) {
		this.bTime = bTime;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
		
}
