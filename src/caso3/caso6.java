package caso3;

import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr = 0, edad = 0, num_aptos =  0;
		String nombre = "", estado = "", continuar = "S";
		
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("---- R e g i s t r o [" + nr + "]----");
			System.out.println("---------------------------");
			
			System.out.println("Nombre del participante: ");
			nombre = sc.nextLine();
			
			System.out.println("Edad del participante: ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				num_aptos++;
			
			}
			else
				estado = "Menor de edad";
			
			System.out.println("Estado : " + estado);
			
			sc.nextLine();
			
			System.out.println("¿Desea registrar otro participante? <S/N>: ");
			continuar = sc.nextLine();
		}
		
		System.out.println("\n--- R E S U M E N ---");
		System.out.println("Cantidad de participantes: " + nr);
		System.out.println("Participantes aptos para votar: " + num_aptos);
		
		
	}
}

	
		


