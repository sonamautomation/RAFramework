package com.pojo;

import java.util.List;

public class radar {

	private List<past> past;
	private List<nowcast> nowcast;

	public List<com.pojo.past> getPast() {
		return past;
	}

	public void setPast(List<com.pojo.past> past) {
		this.past = past;
	}

	public List<com.pojo.nowcast> getNowcast() {
		return nowcast;
	}

	public void setNowcast(List<com.pojo.nowcast> nowcast) {
		this.nowcast = nowcast;
	}
	
	
}
