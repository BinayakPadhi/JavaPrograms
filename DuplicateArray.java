package programs;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		
		System.out.print("Enter the No of elments you want to store in an array  ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int arr[] = new int[number]; 
		
		System.out.println("Enter "+number+" elements");
		
		for (int i=0; i<number; i++)
		{
			arr[i]= sc.nextInt(); 
			
		}
		
		System.out.println("Entered array is  ");
		for(int j : arr){
		System.out.print(j+" ");
		}

	}

}
