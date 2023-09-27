import java.util.Scanner;

public class exo9 {

	public static void main(String[] args) {
		// Écrivez une méthode qui calcule la factorielle d’un nombre donné.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a number to calculate its factorial :");
		int nombre = sc.nextInt();
		
		
		int factorielle = 1;
		
		for(int i = 1; i <= nombre; i++) {
			factorielle*=i;
		}
		System.out.println("La factorielle de : " + nombre + " est :" + factorielle);
	}

}
