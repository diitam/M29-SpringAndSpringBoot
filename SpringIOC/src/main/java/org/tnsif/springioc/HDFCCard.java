package org.tnsif.springioc;
//implementing DebitCard interface
public class HDFCCard implements DebitCard {
	//added unimplemented methods
	@Override
	public void deposit() {
		System.out.println("HDFC-Depositing amount of 1 lakh rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC-Withdrawing amount of 20 thousand rupees");

		
	}

}
