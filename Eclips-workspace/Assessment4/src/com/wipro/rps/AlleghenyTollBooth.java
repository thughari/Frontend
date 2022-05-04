package com.wipro.rps;

public class AlleghenyTollBooth implements TollBooth {

	private int toll,total;
	private int t;
	@Override
	public void calculateToll(Truck ford) {
		t+=1;
		toll=(ford.axles()*5)+((ford.weight()/500)*10);
		total+=toll;
		
		System.out.println("\nArrival of "+ ford.getClass().getName().replace("com.wipro.rps.", ""));
		System.out.printf("\nTruck arrival - Axles: %d Total weight: %d Toll due: $%d\n",
				ford.axles(),ford.weight(),toll);
		
	}

	@Override
	public void displayData() {
		System.out.println("\n*** Collecting receipts ***");
		System.out.printf("\nTotals since the last collection - Receipts: $%d Trucks: %d\n",total,t);
		System.out.println("\n********** Reset Reciepts **********");
		toll=0;
		t=0;
		System.out.printf("\nTotals since the last collection - Receipts: $%d Trucks: %d",toll,t);
		
	}

}
