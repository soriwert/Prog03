import java.util.Scanner;
public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n=1;
		int contador = 0;
		System.out.println ("Escriba un número: ");
		
		
		while (n > 0){
		n=teclado.nextInt();
		//System.out.println (n);
		contador = n+contador;
		}
		if (n==0);
		System.out.println (contador);
	}

}
