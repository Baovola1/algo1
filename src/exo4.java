import java.util.Scanner;

public class exo4 {

	public static void main(String[] args) {
		// Écrivez un programme Java qui prend deux nombres en entrée et affichez le produit(multiplication) de deux nombres.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int nb1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int nb2 = sc.nextInt();
		
		
		int produit = nb1 * nb2;
		System.out.println("le produit de deux nombres est :" +produit);

	}

}
