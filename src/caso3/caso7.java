package caso3;

import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		for(int x = 1; x <= 10; x++)
			System.out.println(x + " Bienevenido " + nombre + " al ciclo");
		
		System.out.println("\n");
		
		for(int j = 10; j <= 1; j-= 2)
			System.out.println("Valor: " + j);

	}

}
