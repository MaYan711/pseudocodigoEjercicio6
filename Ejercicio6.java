import java.util.*;

public class Ejercicio6 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int per =0, edad = 0, may = 0, men = 0, tmen = 0, tmay = 0;
		double pmen = 0, pmay = 0;

		while (per <= 3 ){
			System.out.print("Ingrese la edad: ");
			edad = sc.nextInt();

			if (edad < 25){
				men += 1;
				tmen += edad;
				pmen = tmen / men;
			} 
			else {
				may += 1;
				tmay += edad;
				pmay = tmay / may;
			}
			per ++;
		}
		System.out.print("El promedio de arriba de 25 es de: "+ pmay +"y por abajo de 25 es " + pmen);
	}
}