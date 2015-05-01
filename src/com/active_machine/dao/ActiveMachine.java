package com.active_machine.dao;

public class ActiveMachine {
	private String ID;
	private String time;
	private String moveTime;
	private String restTime;
	private String displacement;
	private String sTime;
	private String machineID;
	
	public ActiveMachine(){
		ID = "";
		time = "";
		moveTime = "";
		restTime = "";
		displacement = "";
		sTime = "";
		machineID = "";
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMoveTime() {
		return moveTime;
	}
	public void setMoveTime(String moveTime) {
		this.moveTime = moveTime;
	}
	public String getRestTime() {
		return restTime;
	}
	public void setRestTime(String restTime) {
		this.restTime = restTime;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String getMachineID() {
		return machineID;
	}
	public void setMachineID(String machineID) {
		this.machineID = machineID;
	}
	
}
