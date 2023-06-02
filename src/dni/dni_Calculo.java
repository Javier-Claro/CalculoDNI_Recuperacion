package dni;

import java.util.Scanner;

public class dni_Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se crea un scanner:
		Scanner sc = new Scanner(System.in);
		
		//Se crean las diferentes variables que se van a usar:
		boolean verdaderoDNI = false;
		int dni;
		int restoDNI;
		char letraDNI_Usuario = 'X';
		char[] letraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E',};
		
		System.out.println("\nBievenido al cálculo de letra de dni.");
		
		//Se hace un control del flujo:
		do {	
		System.out.print("\nIndique su número de DNI: ");
		dni = sc.nextInt();
		
		//Condicional por si el número que se indique es menor o mayor de los rangos del dni:
		if ((dni < 10000000) || (dni > 99999999)) {
			
			System.err.println("\n**ERROR**, el número de dni debe de ser de 8 cifras.");
		}
		
		else {
			//Se calcula el resto del número del dni, se le atribuye "true" al boolean para salir del bucle, y se le da el carácter correspodiente al dni:
			verdaderoDNI = true;
			restoDNI = (dni%23);
			letraDNI_Usuario = letraDNI[restoDNI];
		}
		}while(verdaderoDNI != true);
		
		//Se escriben los resultados:
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\nSu letra de su DNI es : " + letraDNI_Usuario);
		System.out.println("\nPor lo tanto, su dni completo será: " + dni + letraDNI_Usuario);
		
		sc.close();
	}
}