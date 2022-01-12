package Training;

import java.util.Scanner;

public class Iphone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Memory Size:");
		int Memory = sc.nextInt();
		if(Memory==64)
		{
			System.out.println("price of Iphone with " + Memory + "GB Memory is 50 Thousand Rupees.");
		}
		else if(Memory==128)
		{
			System.out.println("price of Iphone with " + Memory + "GB Memory is 75 Thousand Rupees.");
		}
		else if(Memory==256)
		{
			System.out.println("price of Iphone with " + Memory + "GB Memory is 90 Thousand Rupees.");
		}
		else
		{
			System.out.println("Memory size is Invalid.");
		}
			}
}

