package model;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int coteA, coteB, coteC;
		
		do {
			
			System.out.println("Entrez une valeur positive pour le cot� A :");
			coteA = input.nextInt();
			System.out.println("le cot� A vaut : " + coteA);
			
		}while( coteA <= 0 );
		
		do {
		
			System.out.println("Entrez une valeur positive pour le cot� B positive :");
			coteB = input.nextInt();
			System.out.println("le cot� B vaut : " + coteB);
		}while( coteB <= 0);
		
		do {
				
			System.out.println("Entrez une valeur positive pour le cot� C positive :");
			coteC = input.nextInt();
			System.out.println("le cot� C vaut : " + coteC);
		}while( coteC <= 0);
			
		
		input.close();
		TriangleIdentifier.identifier(coteA, coteB, coteC);

	}

}
