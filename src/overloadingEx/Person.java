package overloadingEx;

public class Person { 	//생성자 overloading
	
	public static final int MAN = 1;
	public static final int WOMAN = 2;
	
	public static float sum = 0; // 공유변수 생성 - memory 절약하기 위함.
	public static float cnt = 0;
	
	protected int age; // 상속받은 것 까지만 허용할께요.
	protected int gender;
	private float score;
	
	
	public Person(){ 	//default
		this.age = 10;	
		this.gender = MAN;
		this.score = 0;
		Person.sum += this.score; // 해당 score 값을 더해서 공유 변수에 넣는다
		Person.cnt = cnt++;
		
		System.out.println("내가 바로 person 생성자");
	}
	
	
	
	public Person(int age, int gender, float score){	
		this.age = age;
		this.gender = gender;
		this.score = score;
		Person.sum += this.score;
		Person.cnt = cnt++;
	}
	
	public static float getSum(){ // static method
		return sum;
	}
	
	public static float getCnt(){
		return cnt;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	
}
