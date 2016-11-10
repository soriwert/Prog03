import java.util.Scanner;
public class ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n=1;
		int contador=0;
		int a=0;
		int m=0;
		int mayor=0;
		int menor=0;
		
		
		System.out.println ("Escriba un número");
		while (n!=0){
			n=teclado.nextInt();
			contador=n+contador;
			a++;
			m=n;
			if (m<n);
			
		}
		System.out.println ("La media de los valores es: "+contador/a);

	}

}
