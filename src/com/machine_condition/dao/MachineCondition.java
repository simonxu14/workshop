package com.machine_condition.dao;

public class MachineCondition {
	private String machineID;
	private String time;
	private String moveTime;
	private String restTime;
	private String displacement;
	private String sTime;
	private String condition;

	
	public MachineCondition(){
		machineID = "";
		time = "";
		moveTime = "";
		restTime = "";
		displacement = "";
		sTime = "";
		condition = "";
	}
	
	
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
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
