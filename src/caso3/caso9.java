package caso3;


import java.util.Scanner;



public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float  asist = 0, por_asist = 0;
		int i = 0, nr = 0, n1 = 0, n2 = 0, n3 = 0, si_cer = 0;
		String estado = "", continuar = "S";
		
		String [] nombre = new String [nr];
		float [] promedio = new float [nr];
		
		String nom_mayor = "";
		String nom_menor = "";
		float prom_mayor = 0;
		float prom_menor = prom_mayor;
		
	
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("---- R e g i s t r o [" + nr + "]----");
			System.out.println("---------------------------");
			System.out.println("Nombre de alumno: ");
			nombre [i] = sc.nextLine();
			System.out.println("Nota 1: ");
			n1 = sc.nextInt();
			System.out.println("Nota 2: ");
			n2 = sc.nextInt();
			System.out.println("Nota 3: ");
			n3 = sc.nextInt();
			System.out.println("Asistencia [1-12]: ");
			asist = sc.nextInt();
			
			promedio[i] = (float)((n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5));
			por_asist = (float)((asist * 100) / 12);
			
			if (promedio [i] >= 13 && por_asist >= 70) {
				estado = "Obtiene certificado";
			    si_cer++;
			}
			else
				estado = "Sin certificado";
			
			if (promedio[i] > prom_mayor) {
				prom_mayor = promedio [i];
				nom_mayor = nombre [i];
			}
			if (promedio[i] < prom_menor) {
				prom_menor = promedio [i];
				nom_menor = nombre [i];
			}
			        
			
			System.out.println("-----------------");
			System.out.println("R E S U L T A D O S");
			System.out.println("-----------------");
			System.out.println("Promedio: " + promedio[i]);
			System.out.println("Asistencia: " + por_asist + "%");
			System.out.println("Estado: " + estado);
			
            sc.nextLine();
			
			System.out.println("¿Registrar otro? [S/N]: ");
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
