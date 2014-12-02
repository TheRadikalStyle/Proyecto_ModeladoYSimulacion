/*@Author
*	David Ochoa Gutierrez
*	1522449
*/

			/*Metodo Generador Congruencial Lineal*/

import java.util.Scanner;

public class numerosAleatorios{

static Scanner sc = new Scanner(System.in);

public static void main(String args[]){

 float N; //Cantidad numeros aleatorios
 float A; //Valor del multiplicador
 float M; //Valor del modulo
 float X; //Valor de la semilla
 float C = 1; //Valor de la constante aditiva

 float R; //Operacion del Método Congruencial Lineal (MCL)

System.out.println("Ingresa la cantidad de numeros a generar N: ");
N = sc.nextFloat();

System.out.println("Ingresa el valor del multiplicador A: ");
A = sc.nextFloat();

System.out.println("Ingresa el valor del modulo M: ");
M = sc.nextFloat();

System.out.println("Ingresa el valor de la semilla X: ");
X = sc.nextFloat();

	System.out.println("\n");
for(int i = 0; i < N; i++){
	R = ((A * X + C) % M);
	X = R;
	R = R / M;
	System.out.println(R);
}
	System.out.println("\n");

}
}