package com.pojo;

import java.util.List;

public class WeatherDetails {
	private float version;
	private int generated;
	private String host;
	private radar radar;
	private satellite satellite;
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public int getGenerated() {
		return generated;
	}
	public void setGenerated(int generated) {
		this.generated = generated;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public com.pojo.radar getRadar() {
		return radar;
	}
	public void setRadar(com.pojo.radar radar) {
		this.radar = radar;
	}
	public com.pojo.satellite getSatellite() {
		return satellite;
	}
	public void setSatellite(com.pojo.satellite satellite) {
		this.satellite = satellite;
	}
	
	

}
