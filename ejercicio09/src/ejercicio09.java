import java.util.Scanner;
public class ejercicio09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);


		int n,a, suma=0;
		
		


		System.out.println("Escriba un número n ");
		n=teclado.nextInt();
		a=n-1;
		//System.out.print("Los divisores son: ");
		while (a!=0){
			

		
		if (n%a==0){
			//System.out.println ("\n"+a);
			suma+=a;

		}
		--a;
		
		}
		System.out.println ("El número n vale: "+n);
		if (suma == n){
		
		
		System.out.println ("suma total divisores: "+suma+" Este número pertenece a números perfectos");
		}
		else {
			System.out.println ("suma total divisores: "+suma+" Este número no es perfecto");
		}
			
	}
}
