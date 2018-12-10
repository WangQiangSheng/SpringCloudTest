package com.miroslav.house.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value="spring.httpclient")
public class HttpClientProperties {

	private Integer connectTimeOut = 1000;
	private Integer socketTimeOut = 10000;
	
	private String agent = "agent";
	private Integer maxConnPerRoute = 10;
	private Integer maxConnTataol = 50;
	public Integer getConnectTimeOut() {
		return connectTimeOut;
	}
	public void setConnectTimeOut(Integer connectTimeOut) {
		this.connectTimeOut = connectTimeOut;
	}
	public Integer getSocketTimeOut() {
		return socketTimeOut;
	}
	public void setSocketTimeOut(Integer socketTimeOut) {
		this.socketTimeOut = socketTimeOut;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public Integer getMaxConnPerRoute() {
		return maxConnPerRoute;
	}
	public void setMaxConnPerRoute(Integer maxConnPerRoute) {
		this.maxConnPerRoute = maxConnPerRoute;
	}
	public Integer getMaxConnTataol() {
		return maxConnTataol;
	}
	public void setMaxConnTataol(Integer maxConnTataol) {
		this.maxConnTataol = maxConnTataol;
	}
	
}
