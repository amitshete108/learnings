package ClassAndObjects;

import java.util.*;


//Changes in Dev branch
public class Car {
	private String company;
	private String carName;

	static int noOfCars=0;
	static List<String> names=new ArrayList();

	public Car(String company, String carName) {
		this.company=company;
		this.carName=carName;
		noOfCars++;
	}

	public void StringCompany(String company) {
		this.company=company;
	}

	public String getCompany() {
		return company;
	}
	public void StringcarName(String carName) {
		this.carName=carName;
	}

	public String getcarName() {
		return carName;
	}

	//Static Methods

	public static void setNoOfCars(int no) {
		noOfCars=no;
	}
	public static int getNoOfCars() {
		return noOfCars;
	}

	static {
		names.add("Car1");
		names.add("Car2");
		names.add("Car3");
		names.add("Car4");

	}	

}
