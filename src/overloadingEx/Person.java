package overloadingEx;

public class Person { 	//������ overloading
	
	public static final int MAN = 1;
	public static final int WOMAN = 2;
	
	public static float sum = 0; // �������� ���� - memory �����ϱ� ����.
	public static float cnt = 0;
	
	protected int age; // ��ӹ��� �� ������ ����Ҳ���.
	protected int gender;
	private float score;
	
	
	public Person(){ 	//default
		this.age = 10;	
		this.gender = MAN;
		this.score = 0;
		Person.sum += this.score; // �ش� score ���� ���ؼ� ���� ������ �ִ´�
		Person.cnt = cnt++;
		
		System.out.println("���� �ٷ� person ������");
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
