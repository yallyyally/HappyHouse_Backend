package com.ssafy.vue.help;

public class BooleanResult {

	private String name;
	private boolean check;
	private String state ="true";
	
	public BooleanResult() {

	}
	
	public BooleanResult(String name, boolean check, String state) {
		super();
		this.name = name;
		this.check = check;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "NumberResult [name=" + name + ", check=" + check + ", state=" + state + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}