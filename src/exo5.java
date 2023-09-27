import java.util.Scanner;

public class exo5 {

	public static void main(String[] args) {
		// Écrivez un programme Java qui prend un nombre en entrée et affiche sa table de multiplication jusqu’à 10.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("write a number");
		 int nb1 = sc.nextInt();
		 
		 System.out.println("La table de multiplication du nombre saisi est :");
		 for( int i =0; i< 10; i++) {
			 System.out.println(nb1 + "x" + (i + 1)+ "="+(nb1 *(i+1)));
		 }
		 
		
	}

}
