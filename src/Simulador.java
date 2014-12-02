import java.util.Scanner;

public class Simulador {

	static Scanner sc = new Scanner(System.in);
	static int tLimite;
	static int Reloj = 0;
	static int Delta = TLL(Unif); //Tiempo de llegada de pasajeros
	static int NPV = 0;
	static int Cola = 0;
	static int TET = 0;
	static int TLL = 0;

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
		TET = TET + Cola * Delta;
		TLL = TLL - Delta;
		if(TLL == 0){
			CP(?);
			Cola = Cola + 1;
			TLL(Unif);
		}else{
			TS = TS - Delta;
			if(TS < 0){
				TO = TS;
				TS = 0;
				ActualizaCola();
			}else{
				if(TS = 0){
					ActualizaCola();
				}else{
					if(TS > 0){
						System.out.println("Reloj: "+Reloj);
						System.out.println("Cola: "+Cola);
						System.out.println("Delta: "+Delta);
						System.out.println("CP: "+CP);
					}
				}
			}
		}
		
	}

	public static void ActualizaCola() {
		if(Cola > 0){
			System.out.println("Reloj: "+Reloj);
			System.out.println("Cola: "+Cola);
			System.out.println("Delta: "+Delta);
			System.out.println("CP: "+CP);
		}else{
			Cola = Cola - 1;
			TS(Unif);
		}
		
	}
	
}