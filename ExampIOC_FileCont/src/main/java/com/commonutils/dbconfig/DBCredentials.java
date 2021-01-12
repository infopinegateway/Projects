package com.commonutils.dbconfig;

public class DBCredentials{
 
		private String dbUserName;
		private String dbPassword;
		private String dbURL;
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
		public String getDbURL() {
			return dbURL;
		}
		public void setDbURL(String dbURL) {
			this.dbURL = dbURL;
		}
		@Override
		public String toString() {
			return "DBCredentials [dbUserName=" + dbUserName + ", dbPassword=" + dbPassword + ", dbURL=" + dbURL + "]";
		}
		
		

}
