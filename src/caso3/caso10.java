package caso3;


import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String continuar="S", nom_1="", nom_2="", tar_nom = "";
		int nr = 0, porc = 0, min_mayor = 0;
		float s_menor = 0, s_mayor = 0;
		
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("Registro de Empleados (" + nr + ")");
			System.out.println("---------------------------");
			System.out.print("Empleado: ");
			String nombre = sc.nextLine();
			System.out.print("Horas trabajadas: ");
			float ht = sc.nextFloat();
			System.out.print("Tarifa por hora: ");
			float tarifa = sc.nextInt();
			System.out.print("Minutos de tardanza: ");
			int min = sc.nextInt();
			System.out.println("\n--------------------");
			System.out.println("     Resultados");
			System.out.println("--------------------");

			float s_bruto = ht * tarifa, bon = 0, des = 0;

			if (nr == 1) {
				
				min_mayor = min;
			}
			
			if (ht <= 50) 
				bon = 0;
			else if (ht > 50 & ht <= 60) 
				bon = s_bruto * 0.02f;
			else if (ht > 60 & ht <= 70) 
				bon = s_bruto * 0.08f;
			else if (ht > 70 & ht <= 80) 
				bon = s_bruto * 0.13f;
			else if (ht > 80) 
				bon = s_bruto * 0.15f;
			
			if (min <= 15) 
				des = 0;
			else if (min > 15 & min <= 30) 
				des = min * s_bruto * 0.003f;
			else if (min > 30) 
				des = min * s_bruto * 0.005f;
			
			float meta = (ht * 100)/80;
			float sue_net = s_bruto + bon - des;
			System.out.println("Sueldo bruto: " + s_bruto);
			System.out.println("Bonificación: " + bon);
			System.out.println("Descuento: " + des);
			System.out.println("Sueldo neto: " + sue_net );
			System.out.println("% Alcanzado: " +  meta + "%");
			sc.nextLine();
			
			if (meta > 90) 
				porc ++;
			
			if (min > min_mayor) 
				min_mayor = min; tar_nom = nombre;

			if (sue_net > s_mayor) {
				s_mayor = sue_net;
				nom_1 = nombre;
			}
			else if (sue_net > s_menor) {
				s_menor = sue_net;
				nom_2 = nombre;
			}

			System.out.println("-------------------------");
			System.out.print("¿Nuevo empleado? [S/N]: ");
			continuar = sc.nextLine();
			
		}

		System.out.println("--------------------");
		System.out.println("     Resumen");
		System.out.println("--------------------");
		System.out.println("Número de empleados: " + nr);
		System.out.println("Sueldo neto mayor: " + s_mayor + " pertenece a " + nom_1);
		System.out.println("Sueldo neto menor: " + s_menor + " pertenece a " + nom_2);
		System.out.println("Empleado con más minutos de tardanza: " + tar_nom + " (" + min_mayor + " min.)");
		System.out.println("Cantidad de empleados con más del 90% de la meta: " + porc);
		

	}
}
