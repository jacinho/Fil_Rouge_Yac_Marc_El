package model;

public class TriangleIdentifier {
	
	public static void identifier(int coteA, int coteB, int coteC) {
		
		
		if (coteA==coteB && coteB==coteC) {
			System.out.println("votre triangle est �quilat�ral");
			
		}
		else if(coteA==coteB || coteA==coteC ||coteC==coteB) {
			System.out.println("votre triangle est isoc�le");
		}
		
		else {
			System.out.println("votre triangle est scal�ne");
		}
		
	}
	
	
	

}
