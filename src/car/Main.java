package car;

public class Main {
	public static void main(String args[]){
		Car car = new Car("Benz", Car.MIDDLE_CAR, "s500", 13000);
		
		System.out.println("Company : " + car.getCompanyName());
		System.out.println("Type : " + car.getCarType2Str());
		System.out.println("Model : " + car.getModel());
		System.out.println("Price : " + car.getPrice());
		System.out.println("Model Color : " + car.getModelColor2fullStr());
		
	}
}
