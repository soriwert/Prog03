import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);


		int n,a;
		
		


		System.out.println("Escriba un n�mero n ");
		n=teclado.nextInt();
		a=n-1;
		System.out.print("Los divisores son: ");
		while (a!=0){

		
		if (n%a==0){
			System.out.print(a+" ");

		}
		--a;
	}
}
}
