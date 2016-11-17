import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int n, divisor=2,p=1;
		boolean esPrimo=true;

		System.out.println("Introduzca un numero N: ");
		n=teclado.nextInt();
		p=n;
		do {
			p++;
		
		    // compruebo si p es primo
			
			
		} while (!esPrimo);
			esPrimo=p%divisor !=0;
			divisor++;
		
		
		System.out.println("El número "+p+" es");
		System.out.println ((esPrimo ? "" : " no ") + "primo");
		
		
		
		}
	}

/*while (esPrimo && divisor < n){
esPrimo=n%divisor !=0;
divisor++;

while (esPrimo && divisor > n)
	n++;
	esPrimo=n%divisor !=0;
}*/



