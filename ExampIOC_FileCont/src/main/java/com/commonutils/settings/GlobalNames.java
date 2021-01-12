package com.commonutils.settings;

public class GlobalNames {
	
		private String cmpFooterAddress;
		private String logoPath;
		private double maxApprovalLimit;
		private double minApprovalLimit;
		
		
		public String getCmpFooterAddress() {
			return cmpFooterAddress;
		}
		public void setCmpFooterAddress(String cmpFooterAddress) {
			this.cmpFooterAddress = cmpFooterAddress;
		}
		public String getLogoPath() {
			return logoPath;
		}
		public void setLogoPath(String logoPath) {
			this.logoPath = logoPath;
		}
		public double getMaxApprovalLimit() {
			return maxApprovalLimit;
		}
		public void setMaxApprovalLimit(double maxApprovalLimit) {
			this.maxApprovalLimit = maxApprovalLimit;
		}
		public double getMinApprovalLimit() {
			return minApprovalLimit;
		}
		public void setMinApprovalLimit(double minApprovalLimit) {
			this.minApprovalLimit = minApprovalLimit;
		}
		
		@Override
		public String toString() {
			return "GlobalNames [cmpFooterAddress=" + cmpFooterAddress + ", logoPath=" + logoPath
					+ ", maxApprovalLimit=" + maxApprovalLimit + ", minApprovalLimit=" + minApprovalLimit + "]";
		}
		
		

}
