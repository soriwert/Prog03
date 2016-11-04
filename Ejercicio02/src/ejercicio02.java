import java.util.Scanner;
public class ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int n=1;
		int m=1;
		int resultado = m*n;
		
		
		
		System.out.println ("Introduzca el número que desea multiplicar: ");
		m=teclado.nextInt();
		if (m >= 1 && m<=100){
			
			System.out.println("Tabla de multiplicar de "+m);
			resultado = m*n;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			System.out.println(m+" * "+n+" = "+n*m);
			n++;
			//System.out.println(m*n+" * 2 = "+resultado);
			
			}
			
		}
	}
		
			
		


