package overloadingEx;

public class Student extends Person{  // ��� �ҰԿ�
	
	public Student(){
		super();
		System.out.println(" I am Student maker !");
	}
	
	public int getAge(){
		return age - 1;
	}
	
}
