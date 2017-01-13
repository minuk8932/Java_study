package car;

public class Car { 	//class 선언
	public static final int LARGE_CAR = 0; 
	public static final int MIDDLE_CAR = 1;
	public static final int SMALL_CAR = 2; // CarType 상수 형(final) 선언
								// static : 공유변수 선언 class 이름으로 접근
	public static final int SERIES_S = 4;
	public static final int SERIES_A = 5;
	
	private String companyName;							
	private int carType;
	private String model;
	private int price; // class 밖에서 값이 변경되는 것을 막는다. encapsulation
	
	public Car (String companyName, int carType, String model, int price){ 
		// 생성자 선언. class선언 시 무조건 한번 실행
		
		this.companyName = companyName;
		this.carType = carType;
		this.model = model;
		this.price = price;
		
		System.out.println("making car");
	}
	
	// get set : encapsulation된 변수를 사용하기위해
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	public String getModel() {
		return this.model;
	}
	public void setModel(String model){
		this.model = model;
	}
	
	public String getCompanyName(){
		return this.companyName;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	
	public int getCarType(){
		return this.carType;
	}
	public void setCarType(int carType){
		this.carType = carType;
	}
	
	
	public String getCarType2Str(){ //굳이 String으로 변환이 필요할시 새로 정의
		switch(this.carType){
		case LARGE_CAR:
			return "Large";
		case MIDDLE_CAR:
			return "Middle";
		case SMALL_CAR:
			return "Small";
		}
		return "unKnown";
	}
	
	
	public Boolean isLargeCar(){
		return this.carType == LARGE_CAR ? true : false;
	}
	
	public Boolean isMoreExpensive(Car car2){ // car2 비교대상 필요
		return this.price > car2.getPrice() ? true : false;
	}
	
	public String getMEModel (Car car2) {
		return isMoreExpensive(car2) ? car2.getModel() : this.model;
	}
	
	public int getModelColor (){
		return this.model.startsWith("s") ? SERIES_S : SERIES_A;
	}
	
	public String getModelColor2fullStr(){
		
		switch(getModelColor()){
			case SERIES_S:
				return "white";
				
			case SERIES_A:
				return "black";
		}
		return "unknown";
	}
	
	
}
