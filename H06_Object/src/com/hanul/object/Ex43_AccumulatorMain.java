package com.hanul.object;

public class Ex43_AccumulatorMain {

	public static void main(String[] args) {

		Ex42_Accumulator acc1 = new Ex42_Accumulator();
		Ex42_Accumulator acc2 = new Ex42_Accumulator();
		acc1.accumulator(10);
		acc2.accumulator(5);
		
		System.out.println("acc1total : " + acc1.total
				+ "\nacc2total : " + acc2.total
				+ "\ngrandtotal : " + acc1.grandTotal
				+ "\nacc2grandtotal : " + acc2.grandTotal
				+ "\ngrandtotal : " + Ex42_Accumulator.grandTotal);
	
		
		
		
	}

}
