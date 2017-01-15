package practice_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class User{
	private String name;
	private String pass;
	private int deposit;
	
	public User(){
//		this.name = name;
//		this.pass = pass;
//		this.deposit = deposit;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass(){
		return this.pass;
	}
	
	public void deposit(int deposit){
		this.deposit += deposit;
	}
	public void withdraw(int deposit){
		this.deposit = this.deposit - (deposit + 1000);
	}
	
	public int getDeposit(){
		return this.deposit;
	}
	
}

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		User usr = new User();
		String[] id = new String[2];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean syson = true;
		String tempPW;
		int tempDepo = 0;
		
		System.out.println("Making balance.");
		System.out.print("Enter the name : ");
		id[0] = br.readLine();
		usr.setName(id[0]);
		System.out.print("Enter the password : ");
		id[1] = br.readLine();
		usr.setPass(id[1]);
		
LOOP:	while (syson){
	
			System.out.println("select the menu ");
			System.out.println("1. User Info check.");
			System.out.println("2. User PW change.");
			System.out.println("3. Deposit.");
			System.out.println("4. Withdraw.");
			System.out.println("5. End");
			
			switch(Integer.parseInt(br.readLine())){
			case 1:
				System.out.println("1. User Info check.");
				System.out.println("User name : " + usr.getName());
				System.out.println("User password : " + usr.getPass());
				System.out.println("User deposit : " + tempDepo);
				break;
				
			case 2:
				System.out.println("2. User PW change.");
				System.out.print("Check before User PW : ");
				tempPW = br.readLine();
				
				if(tempPW.equals(id[1])){
					System.out.print("Enter the another PW : ");
					id[1] = br.readLine();
					usr.setPass(id[1]);
					break;
				}
				else{
					System.out.println("Wrong PW.");
					break;
				}
				
			case 3:
				System.out.println("3. Deposit.");
				System.out.print("Enter the money : ");
				tempDepo = Integer.parseInt(br.readLine());
				usr.deposit(tempDepo);
				System.out.println("Deposit is Completed.");
				System.out.println("now User Balane : " + usr.getDeposit());
				break;
				
			case 4:
				System.out.println("4. Withdraw.");
				System.out.print("Enter the money to withdraw (charge - 1000won) : ");
				tempDepo = Integer.parseInt(br.readLine());
				if(tempDepo < usr.getDeposit()){
					usr.withdraw(tempDepo);
					System.out.println("Withdraw is Completed.");
					System.out.println("now User Balane : " + usr.getDeposit());
					break;
				}
				else{
					System.out.println("The Balance is deficient.");
					System.out.println("Withdraw is Failed.");
				}
				break;
				
			case 5:
				
				break LOOP;
				
				default :
					System.out.println("you select wrong number.");
					break;
			}
		}
		System.out.println("Finish !");
	}

	
}
