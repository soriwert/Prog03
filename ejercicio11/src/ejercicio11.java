import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n=0, divisor,p=1;
		boolean esPrimo;
		boolean fin = false;

		System.out.println("Introduzca un numero N: ");
		p=teclado.nextInt();
		
		
		do {
			
			
			
			
			
			
			p++;
			divisor = 2;
			esPrimo = true;
			while (esPrimo && divisor < p){
				esPrimo=p%divisor !=0;
				divisor++;
			}

			
			
			if (esPrimo)
				fin = true;

			

		} while (p==n && !fin);




		System.out.println("El número "+p+" es");
		System.out.println ((esPrimo ? "" : " no ") + "primo");



	}
}
