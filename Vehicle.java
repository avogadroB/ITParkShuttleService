package DSLMiniProj;

class Vehicle {
	String numberPlate;
	String colour;
	double mileage;
	Vehicle next;
	

	Vehicle(String numberPlate, String colour, double mileage) {
		this.numberPlate = numberPlate;
		this.colour = colour;
		this.mileage = mileage;
		next = null;
	}
}
