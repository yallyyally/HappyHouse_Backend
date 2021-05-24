package com.ssafy.vue.dto;

public class PopulationDto {
	private String gugun;
	private String dong;
	private int population;
	private int movein;
	private int moveout;
	private int oneperson;
	private int twoperson;
	private int threeperson;
	private int fourperson;
	private int morethanfiveperson;
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getMovein() {
		return movein;
	}
	public void setMovein(int movein) {
		this.movein = movein;
	}
	public int getMoveout() {
		return moveout;
	}
	public void setMoveout(int moveout) {
		this.moveout = moveout;
	}
	public int getOneperson() {
		return oneperson;
	}
	public void setOneperson(int oneperson) {
		this.oneperson = oneperson;
	}
	public int getTwoperson() {
		return twoperson;
	}
	public void setTwoperson(int twoperson) {
		this.twoperson = twoperson;
	}
	public int getThreeperson() {
		return threeperson;
	}
	public void setThreeperson(int threeperson) {
		this.threeperson = threeperson;
	}
	public int getFourperson() {
		return fourperson;
	}
	public void setFourperson(int fourperson) {
		this.fourperson = fourperson;
	}
	public int getMorethanfiveperson() {
		return morethanfiveperson;
	}
	public void setMorethanfiveperson(int morethanfiveperson) {
		this.morethanfiveperson = morethanfiveperson;
	}
	@Override
	public String toString() {
		return "PopulationDto [gugun=" + gugun + ", dong=" + dong + ", population=" + population + ", movein=" + movein
				+ ", moveout=" + moveout + ", oneperson=" + oneperson + ", twoperson=" + twoperson + ", threeperson="
				+ threeperson + ", fourperson=" + fourperson + ", morethanfiveperson=" + morethanfiveperson + "]";
	}
	
	
}
