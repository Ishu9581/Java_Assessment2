package rent;

import java.util.Scanner;
public class CarDetails {
	char[] driver= {'A','B','C','D','E'};
	String[] carmodel = {"Sedan","HatchBack","5Stealer","Sedan","HatchBack"};
	double[] rating= {4,4.3,4.8,4.1,4.7};
	float[] distance = {500,1,200,700,430};
	char cardriver;
	public void CarInformation() {
		System.out.println("List of Drivers with Details: \n\n");
		System.out.println("Driver" + "  Carmodel  " + "  Rating  " + "  DistanceFromCustomer");
		for(int i=0;i<5;i++) {
			System.out.println(" "+driver[i] +"\t"+ carmodel[i]+ "\t\t"+ rating[i]+ "\t\t"+ distance[i]+"m");
		}
	}
	public void findMinDis(String carname, float min_dis) {
		String carName = carname;
		for(int j=0;j<5;j++) 
       	 if(carmodel[j].equals(carName)&& rating[j]>=4) {
       		 if(min_dis > distance[j]) {
       			 min_dis = distance[j];
       			 cardriver = driver[j];
       		 }
       	 }
        }

	public boolean checkVehiclePresent(String carname) {
		// TODO Auto-generated method stub
		for(int i=0; i < 5;i++) {
			if(carmodel[i].equalsIgnoreCase(carname)) {
				return true;
			}
		}
		return false;
	}
	public void printDriverName() {
		// TODO Auto-generated method stub
		System.out.println("\nDriver "+cardriver+ "will get you to the destination");
		
	}
	public void printTotalCharge(float distance, int charge) {
		// TODO Auto-generated method stub
		double total_charge = (double) distance*charge;
        System.out.println("\nTotal charge is: "+total_charge);
	}
	
}
