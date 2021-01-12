package com.ioc.commonutils;

public class DBConfig {

	private String hostPort;	
	private String hostIP;
	private String dbUserName;
	private String dbPassword;
	private String dbSchema;
	
	public String getHostPort() {
		return hostPort;
	}
	public void setHostPort(String hostPort) {
		this.hostPort = hostPort;
	}
	public String getHostIP() {
		return hostIP;
	}
	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	public String getDbSchema() {
		return dbSchema;
	}
	public void setDbSchema(String dbSchema) {
		this.dbSchema = dbSchema;
	}
	@Override
	public String toString() {
		return "DBConfig [hostPort=" + hostPort + ", hostIP=" + hostIP + ", dbUserName=" + dbUserName + ", dbPassword="
				+ dbPassword + ", dbSchema=" + dbSchema + "]";
	}
	
	public String getConnectionString(){
		return hostIP+":"+hostPort+":"+dbSchema+",\""+dbUserName+"\",\""+dbPassword+"\"";
	}
	
	
}
