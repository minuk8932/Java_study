package string_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringExample {
	public static void main(String args[]) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String name = br.readLine();
		 //String name = sc.toString();
		
		
		System.out.println(name.substring(1,3));
		
		
		

	}
}