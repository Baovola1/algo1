import java.util.InputMismatchException;
import java.util.Scanner;

public class exo6 {

	public static void main(String[] args) {
		// Écrivez un programme Java pour afficher l’aire et le périmètre d’un cercle.
		
		Scanner sc = new Scanner(System.in);
		
		
		//double pi = 3.14 => Math.PI
		
		try {
			System.out.println("Ecrire le rayon pour calculer l'air et le périmètre");
			//int rayon = sc.nextInt();=> uniquement en entier
			
				String input = sc.next();
			
			//Convertir la chaine en double => pour valider les nombres qu'ils soient entiers ou décimales
			
			double rayon = Double.parseDouble(input);
			
			double air = Math.PI * rayon * rayon;
			System.out.println("L'air du cercle est de " + air);
			
			double perimetre = 2 * Math.PI * rayon;
			System.out.println("Le permetre du cercle est de " + perimetre);
			
		} catch (InputMismatchException e) {
			System.out.println("Nombre non valide, veuillez entrer un nombre decimal");
		} 	

	}
	

}
