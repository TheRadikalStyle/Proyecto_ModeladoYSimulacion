import java.util.Scanner;

public class Simulador {

	static Scanner sc = new Scanner(System.in);
	static int tLimite;
	static int Reloj = 0;
	static int Delta = TLL(Unif); //Tiempo de llegada de pasajeros
	static int NPV = 0; //Nzzumero de pasajeros por viaje
	static int PE = 0; //Pasajeros extra (parados)
	static int Cola = 0;
	static int TET = 0; //Tiempo de espera total
	static int TLL = 0;
	static double TEM = 0; //Tiempo de espera promedio
	static double TO = 0; //Tiempo de ocio
	static double TS = 0; //Tiempo de llegada de los transmetros

	public static void main(String args[]){
		System.out.println("Inserta el tiempo limite de ejecución: ");
		tLimite = sc.nextInt();

		if (Reloj  >= tLimite){
			TEM = TET / tLimite;
			System.out.println("Tiempo de espera total: "+TET);
			System.out.println("Tiempo de espera promedio "+TEM);
		}else{
			Proceso();
		}
	}

	public static void Proceso() {
		Delta = Min(TLL,TS);
		Reloj = Reloj + Delta;
		TET = TET + Cola * Delta;
		TLL = TLL - Delta;
		if(TLL == 0){
			CP(?);
			Cola = Cola + CP;
			TLL(Unif);
		}else{
			TS = TS - Delta;
			if(TS < 0){
				TO = TO - TS;
				TS = 0;
				ActualizaCola();
			}else{
				if(TS = 0){
					ActualizaCola();
				}else{
					if(TS > 0){
						NPV = CT + PE;
						System.out.println("Reloj: "+Reloj);
						System.out.println("Cola: "+Cola);
						System.out.println("Delta: "+Delta);
						System.out.println("CP: "+CP);
						System.out.println("NPV: "+NPV);
					}
				}
			}
		}
		
	}

	public static void ActualizaCola() {
		if(Cola > 0){
			PE(UNIF, 1, 27);
			Cola = Cola - PE;
		}else{
		}
		TS(Unif);
		NPV = CT + PE;
		System.out.println("Reloj: "+Reloj);
		System.out.println("Cola: "+Cola);
		System.out.println("Delta: "+Delta);
		System.out.println("CP: "+CP);
	}
	
}