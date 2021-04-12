package model;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int coteA, coteB, coteC;
		
		do {
			
			System.out.println("Entrez une valeur positive pour le coté A :");
			coteA = input.nextInt();
			System.out.println("le coté A vaut : " + coteA);
			
		}while( coteA <= 0 );
		
		do {
		
			System.out.println("Entrez une valeur positive pour le coté B positive :");
			coteB = input.nextInt();
			System.out.println("le coté B vaut : " + coteB);
		}while( coteB <= 0);
		
		do {
				
			System.out.println("Entrez une valeur positive pour le coté C positive :");
			coteC = input.nextInt();
			System.out.println("le coté C vaut : " + coteC);
		}while( coteC <= 0);
			
		
		input.close();
		TriangleIdentifier.identifier(coteA, coteB, coteC);

	}

}
