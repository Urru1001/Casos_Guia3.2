package caso3;

import  java.text.DecimalFormat ;
import java.util.Scanner;



public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df =  new  DecimalFormat ( " # .00 " );
		float  asist = 0, por_asist = 0, prom_mayor = 0, prom_menor = 0;
		float nr = 0, n1 = 0, n2 = 0, n3 = 0, si_cer = 0;
		String estado = "", continuar = "S", nom_mayor = "", nom_menor = "";
	
	
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("---- R e g i s t r o [" + nr + "]----");
			System.out.println("---------------------------");
			System.out.println("Nombre de alumno: ");
			String nombre = sc.nextLine();
			System.out.println("Nota 1: ");
			n1 = sc.nextInt();
			System.out.println("Nota 2: ");
			n2 = sc.nextInt();
			System.out.println("Nota 3: ");
			n3 = sc.nextInt();
			System.out.println("Asistencia [1-12]: ");
			asist = sc.nextInt();
			
			float promedio = (float)((n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5));
			por_asist = (float)((asist * 100) / 12);
			
			if (promedio >= 13 && por_asist >= 70) {
				estado = "Obtiene certificado";
			    si_cer++;
			}
			else
				estado = "Sin certificado";
			
			if (nr == 1) {
				if (promedio > prom_menor) {
					prom_menor = promedio;
					nom_menor = nombre;
				}
            }
			        
			
			System.out.println("-----------------");
			System.out.println("R E S U L T A D O S");
			System.out.println("-----------------");
			System.out.println("Promedio: " + promedio);
			System.out.println("Asistencia: " + df.format(por_asist) + "%");
			System.out.println("Estado: " + estado);
			
            sc.nextLine();
          
				if (promedio > prom_mayor) {
					prom_mayor = promedio;
					nom_mayor = nombre;
				}
			
			System.out.print("\n¿Registrar otro? [S/N]: ");
			continuar = sc.nextLine();
		}
		
		
		System.out.println("\n--- R E S U M E N ---");
		System.out.println("Numero de alumnos: " + nr);
		System.out.println("Mayor promedio: " + prom_mayor + " pertenece a: " + nom_mayor);
		System.out.println("Menor promedio: " + prom_menor + " pertenece a: " + nom_menor);
		System.out.println("Numero de alumnos certificados: " + si_cer);
		System.out.println("Numero de alumnos sin certificados: " + (nr - si_cer));

   }

}
