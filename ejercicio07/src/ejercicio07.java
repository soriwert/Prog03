import java.util.Scanner;
public class ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n;
		int contador=0;
		int a=0;
		int mayor=0;
		int menor=0;
		
		
		System.out.println ("Escriba un número");
		n=teclado.nextInt();
		mayor=n;
		menor=n;
		while (n!=0){
			
			contador=n+contador;
			a++;
			if (mayor<n){
			mayor=n;
			}
			else
			{
				if (menor>n)
				menor=n;
			}
			n=teclado.nextInt();
			
		}
		System.out.println ("La media de los valores es: "+contador/a);
		System.out.println ("El número mayor de los valores es: "+mayor);
		System.out.println ("El número menor de los valores es: "+menor);
	}

}
