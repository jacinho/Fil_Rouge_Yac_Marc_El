package model;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez le cot� A");
		int coteA = input.nextInt();
		System.out.println("le cot� A vaut : " + coteA);
		
	
		System.out.println("Entrez le cot� B");
		int coteB = input.nextInt();
		System.out.println("le cot� B vaut : " + coteB);
		
			
		System.out.println("Entrez le cot� C");
		int coteC = input.nextInt();
		System.out.println("le cot� C vaut : " + coteC);
		
		input.close();
		TriangleIdentifier.identifier(coteA, coteB, coteC);

	}

}
