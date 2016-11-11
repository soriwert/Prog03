import java.util.Scanner;
public class ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n, factorial=1, resultado;
		
		System.out.println ("Escriba un número N: ");
		n=teclado.nextInt();
		
		
		for (factorial=n-1; factorial>0; factorial--){
		
		resultado= n * factorial;
		
		
		
		System.out.println ("El factorial de "+n+" es: \n"+resultado);
		
				}
		
		
	}
	

}
