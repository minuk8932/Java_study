package person;

public class Person {
	public static final int MAN = 1;
	public static final int WOMAN = 2;
	
	private String name;
	private int age;
	private String city;
	private int gender;
	private String idNum; //ÁÖ¹Îµî·Ï¹øÈ£ µŞÀÚ¸®.
	
	public Person(String name, int age, String city, int gender, String idNum){
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.idNum = idNum;
	}
	
	//set get.
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	
	public int getGender(){
		return this.gender;
	}
	public void setGender(){
		this.gender = gender;
	}
	
	public String getIdNum(){
		return this.idNum;
	}
	public void setIdNum(String idNum){
		this.idNum = idNum;
	}
	
	public Boolean splitIdNum(){
		
		String[] splitIdNum = this.idNum.split("-");
		
		return splitIdNum[1].startsWith("1") ? true : false ;
		
	}
	
	
	public String getSpecificGender(){
		int chk = splitIdNum() == true ? Person.MAN : Person.WOMAN;
		
		if (this.gender == chk){
			return "man";
		}else{
			return "woman";
		}
	}	
}
