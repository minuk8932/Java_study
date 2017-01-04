package boj_2920;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] strArr = line.split(" ");
		br.close();
		
		int before = Integer.parseInt(strArr[0]);
		
		boolean IsAscending = false;
		boolean IsDescending = false;
		
		for(int i =1; i<strArr.length ; i++){
			int num = Integer.parseInt(strArr[i]);
			
			if(before < num){
				IsAscending = true;
			
			}else if(before > num){
				IsDescending = true;
				
			}else{
				IsAscending = true;
				IsDescending = true;
				
			}
			before = num;
		}
		
		if(IsAscending && !IsDescending){
			System.out.println("Ascending!");
		}else if(IsDescending && IsAscending){
			System.out.println("mixed!");
		}else{
			System.out.println("Descending!");
		}
			
		
		
	}
}
