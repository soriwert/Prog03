import java.util.Scanner;
public class sumaAB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int A, B;
		System.out.println ("Escriba el valor de A: ");
		A=teclado.nextInt();
		System.out.println ("Escriba el valor de B: ");
		B=teclado.nextInt();
		int resultado = 0;
		int indice = A+1;
		
		while (indice <= B-1){
			resultado = resultado + indice;
			indice = indice + 1;
			}
		System.out.println ("El resultado obtenido es: "+resultado);

	}
		
}

