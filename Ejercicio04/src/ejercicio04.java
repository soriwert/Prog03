import java.util.Scanner;
public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int n,a;

		System.out.println("Escriba un número n: ");
		n=teclado.nextInt();
		a=n-1;
		boolean x=true;

		while (a>1){
			if (n%a==0){
			
			System.out.println(n+" no es primo ");
			a=2;
			x=false;
			}
			--a;
		}
		if (x)
		System.out.println (n+" Es primo ");
	}
	

}


