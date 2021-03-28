package caso3;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int i = 1, n = 0;
		int num_menor = 10000000;
		
		while(i <= 5) {
			System.out.print("Ingrese número " + i + ": ");
			n = sc.nextInt();
			
		
			if(n < num_menor) 
				num_menor = n;
			
			i++;
		}
		
		System.out.println("\nEl número menor es: " + num_menor);


	}

}
