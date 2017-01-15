package overloadingEx;

public class Student extends Person{  // 상속 할게요
	
	public Student(){
		super();
		System.out.println(" I am Student maker !");
	}
	
	public int getAge(){
		return age - 1;
	}
	
}
