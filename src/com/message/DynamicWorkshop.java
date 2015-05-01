package com.message;

public class DynamicWorkshop {
	private String ID;
	private String workshopID;
	private String temperature;
	private String humidity;
	private String noise;
	
	public DynamicWorkshop(){
		ID = "";
		workshopID = "";
		temperature = "";
		humidity = "";
		noise = "";
	}
	
	
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getWorkshopID() {
		return workshopID;
	}
	public void setWorkshopID(String workshopID) {
		this.workshopID = workshopID;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
}
