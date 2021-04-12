package model;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez le coté A");
		int coteA = input.nextInt();
		System.out.println("le coté A vaut : " + coteA);
		
	
		System.out.println("Entrez le coté B");
		int coteB = input.nextInt();
		System.out.println("le coté B vaut : " + coteB);
		
			
		System.out.println("Entrez le coté C");
		int coteC = input.nextInt();
		System.out.println("le coté C vaut : " + coteC);
		
		input.close();
		TriangleIdentifier.identifier(coteA, coteB, coteC);

	}

}
