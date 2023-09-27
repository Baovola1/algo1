import java.util.Scanner;

public class exo8 {

	public static void main(String[] args) {
		// Écrivez un programme Java pour permuter deux variables.
		  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ecrire un premier nombre");
		 int nb1 = sc. nextInt();
		 
		 System.out.println("Ecrire un second nombre");
		 int nb2 = sc. nextInt();
		 
		 System.out.println("avant échange: number1 = " +nb1+ " ; " + "number2 = " +nb2);

		 System.out.println("On échange les valeurs");
		 
		 int nb3 = nb2;
		 nb2 = nb1;
		 nb1 = nb3;
		 System.out.println("Après échange number1 = " +nb1+ " ; " + "number2 = " +nb2);
	}

}
