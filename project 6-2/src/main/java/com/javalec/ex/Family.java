package com.javalec.ex;

public class Family {
	String papaName;
	String mamaName;
	String sisterName;
	String brotherName;
	
	public String getBrotherName() {
		return brotherName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}

	public Family(String papaName, String mamaName) {
		this.papaName = papaName;
		this.mamaName = mamaName;
	}

	public String getPapaName() {
		return papaName;
	}

	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}

	public String getMamaName() {
		return mamaName;
	}

	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}

	public String getSisterName() {
		return sisterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	
	
}
