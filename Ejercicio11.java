import java.util.*;
public class Ejercicio11{
	public static void main(String[] args) {
		int contimpar = 0;
		int totalpares = 0;
		int contpar = 0;
		int docena2 = 0;
		int numgrande = 0;
		int i = 0;
		int prompar;
		Scanner scan = new Scanner(System.in);
		do {
			int numero;
			int impar;
			System.out.println("Ingrese un numero que pertencezca a la ruleta (0-36)");
			numero = scan.nextInt();
			if (numero >= 0 & numero <= 36) {
				i++;
				if (numero >= numgrande) {
					numgrande = numero;
				}
				if (numero > 12 & numero < 25) {
					docena2++;
				}
				impar = numero%2;
				if (impar == 0) {
					if (numero != 0) {
						contpar++;
						totalpares += numero;
					}
				} else {
					contimpar++;
				}
			} else {
				System.out.println("El numero no pertenece a la ruleta");
			}

		} while ( i < 10);
		prompar = totalpares/contpar;
		System.out.println("Ingresaste " + contimpar + " numeros impares");
		System.out.println("El promedio de numeros pares que ingresaste es de " + prompar);
		System.out.println("Ingresaste " + docena2 + " numeros de la segunda docena");
		System.out.println("El numero ingresado mas grande es " + numgrande);

	}
}