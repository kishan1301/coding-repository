package com.nucleus.POJO;

public class Vendor {
	private int vendorID;
	private String vendorName;
	private String contractStartDate;
	private String contractEndDate;
	private String customerName;

	public int getVendorID() {
		return vendorID;
	}

	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}

	@Override
	public String toString() {
		return "Vendor [vendorID=" + vendorID + ", vendorName=" + vendorName + ", contractStartDate="
				+ contractStartDate + ", contractEndDate=" + contractEndDate + ", customerName=" + customerName + "]";
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
