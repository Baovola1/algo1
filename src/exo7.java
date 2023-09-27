import java.util.InputMismatchException;
import java.util.Scanner;

public class exo7 {

	public static void main(String[] args) {
		//Écrivez un programme Java qui prend trois nombres en entrée pour calculer et afficher la moyenne des nombres.
		 
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the first number");
//		int nb1 = sc.nextInt();
//		
//		System.out.println("Enter the second number");
//		int nb2 = sc.nextInt();
//		
//		System.out.println("Enter the third number");
//		int nb3 = sc.nextInt();
//		
//		int total = nb1+nb2+nb3;
//		int nombre = 3;
//		
//		double moyenne = total / nombre;
//		
//		System.out.println("La moyenne est de : " + moyenne);
		
		int total = 0;
		final int nombreDeValeurs = 3; 

	        try {
	            for (int i = 1; i <= nombreDeValeurs; i++) {
	                System.out.println("Enter number " + i);
	                String input = sc.next();
	                double nombre = Double.parseDouble(input); 
	                total += nombre;
	            }

	            double moyenne =  total / nombreDeValeurs; 
	            System.out.println("La moyenne est de : " + moyenne);
	        } catch (InputMismatchException e) {
	            System.out.println("Nombre non valide. Veuillez entrer un nombre entier.");
	        } finally {
	            sc.close(); 
	        }
	    }	

	}


