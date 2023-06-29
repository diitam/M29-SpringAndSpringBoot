package org.tnsif.springioc;
//implementing DebitCard interface
public class SBICard implements DebitCard {
	//added unimplemented methods
	@Override
	public void deposit() {
		System.out.println("SBI-Depositing amount of 1 lakh rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI-Withdrawing amount of 20 thousand rupees");
		
	}

}
