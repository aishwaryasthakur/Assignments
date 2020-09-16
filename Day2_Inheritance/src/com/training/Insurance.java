package com.training;

public class Insurance {
	
	private int policyNumber;
	private String policyHoldername;
	private int policyHolderAge;
	private double insuredAmount;
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(int policyNumber, String policyHoldername, int policyHolderAge, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHoldername = policyHoldername;
		this.policyHolderAge = policyHolderAge;
		this.insuredAmount = insuredAmount;
	}
	
	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHoldername() {
		return policyHoldername;
	}

	public void setPolicyHoldername(String policyHoldername) {
		this.policyHoldername = policyHoldername;
	}

	public int getPolicyHolderAge() {
		return policyHolderAge;
	}

	public void setPolicyHolderAge(int policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}

	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public double calculatePremium() {
		
		double premium;
		
		if(this.getPolicyHolderAge() < 25) {
			premium = this.getInsuredAmount() * 0.6;
		}
		else {
			premium = this.getInsuredAmount() * 0.7;
		}
		return premium;
	}

}
