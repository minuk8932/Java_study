package person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person man1 = new Person("minuk", 26, "hanam", Person.MAN, "921015-1032451");
		
		System.out.println("your name is : " + man1.getName());
		System.out.println("your age is : " + man1.getAge());
		System.out.println("you are live in : " + man1.getCity());
		System.out.println("your gender is : " + man1.getGender());
		System.out.println("your ID number is : " + man1.getIdNum());
		
		System.out.println("By checking ID number your gender is : " + man1.getSpecificGender());
	}

}
