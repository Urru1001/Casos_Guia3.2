package caso3;

import java.util.Arrays;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nr = 0, i = 0, ht = 0, tf = 0, emp90 = 0;
		float bono = 0, desc = 0;
		String continuar = "S";
		
		String [] nombre = new String [nr];
		double [] sueldo_n = new double [nr];
		double [] min_t = new double [nr];
		
		String nom_mayor = sc.nextLine();
		String nom_menor = sc.nextLine();
		double sn_mayor = sc.nextDouble();
		double sn_menor = sc.nextDouble();
		double min_t_mayor = sc.nextDouble();
		
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("---- R e g i s t r o [" + nr + "]----");
			System.out.println("---------------------------");
			System.out.println("Nombre de alumno: ");
			nombre [i] = sc.nextLine();
			System.out.println("Horas trabajadas: ");
			ht = sc.nextInt();
			System.out.println("Tarifa por hora");
			tf =sc.nextInt();
			System.out.println("Minutos de tardanza: ");
			min_t [i] = sc.nextDouble();
			
			int sueldo_b = ht * tf;
			
			if (ht <= 50)
				bono = 0;
			else if (ht > 50 && ht <= 60)
				bono = sueldo_b * 0.02f;
			else if (ht > 60 && ht <= 70)
				bono = sueldo_b * 0.08f;
			else if (ht > 70 && ht <= 80)
				bono = sueldo_b * 0.13f;
			else
				bono = sueldo_b * 0.15f;
			
			if (min_t[i] <= 15)
				desc = 0;
			else if (min_t[i] > 15 && min_t[i] <= 30)
				desc = (float)(sueldo_b * min_t[i] * 0.003);
			else
				desc = (float)(sueldo_b * min_t[i] * 0.005);
			
			sueldo_n [i] = sueldo_b + bono - desc;
			float porc_h = (ht * 5) / 4;
			if (porc_h > 90)
				emp90++;
			
			if (sueldo_n [i] > sn_mayor) {
				sn_mayor = sueldo_n[i];
				nom_mayor = nombre[i];
			}
			else
				sn_menor = sueldo_n[i];
			if(sueldo_n [i] <  sn_menor) {
				sn_menor = sueldo_n[i];
			    nom_menor = nombre[i];
			}
			
			
			
			System.out.println("========================");
			System.out.println("==R E S U L T A D O S ==");
			System.out.println("========================");
			System.out.println("Sueldo bruto: " + sueldo_b);
			System.out.println("Bonificacion: " + bono);
			System.out.println("Descuento: " + desc);
			System.out.println("Sueldo neto: " + sueldo_n);
			System.out.println("% Alcanzado: " + porc_h + "%");
			
            sc.nextLine();
			
			System.out.println("¿Nuevo empleado? [S/N]: ");
			continuar = sc.nextLine();
			

	}
		System.out.println("\n--- R E S U M E N ---");
		System.out.println("Numero de empleados: " + nr);
		System.out.println("Sueldo neto mayor: " + sn_mayor + "pertenece a " + nom_mayor);
		System.out.println("Sueldo neto menor: " + sn_menor + "pertenece a " + nom_menor);
		if (min_t[i] > min_t_mayor) {
			min_t_mayor = min_t[i];
			nom_mayor = nombre[i];
		}
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + nom_mayor + "(" + min_t_mayor + ")");
		System.out.println("Cantidad de emplados con mas del 90% de la meta: " + emp90);
		

	}
}
