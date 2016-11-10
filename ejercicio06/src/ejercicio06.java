import java.util.Scanner;
public class ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int n=1;
		int m=1;
		int a=1;

		int impar = 0;
		int par = 0;
		System.out.println ("Escriba un número: ");

		while (n!=0){
			n=teclado.nextInt();

			if (a%2==0)
				par=n+par;

			else 
				impar=n+impar;
			a++;
		}

		System.out.println ("total de la suma en el orden par: "+par);
		System.out.println ("total de la suma en el orden impar: "+impar);

	}

}



