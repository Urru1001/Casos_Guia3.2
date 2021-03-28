package caso3;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1, num_mayor = 0, n = 0;
		
		while(i <= 4) {
			System.out.println("Ingrese numero" + i + ":");
			n = sc.nextInt();
			
			if(n > num_mayor)
				num_mayor = n;
			
			i++;
		}
		
		
		
		
		
		
		System.out.println("El numero mayor es: " + num_mayor);

	}

}
