import java.util.Scanner;
public class ejercicio12 {
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		
		double base=0, areaCuadrado=0, areaRectangulo=0, areaTriangulo=0, altura=0, lado=0;
		int eleccion;
		
		System.out.println("Elija una figura seleccionando su n�mero: ");
		System.out.println("1 Tri�ngulo. \n2 Cuadrado. \n3 Rect�ngulo");
		eleccion=teclado.nextInt();
		switch (eleccion){
		case 1:
			
			System.out.println("Escriba la base: ");
			base=teclado.nextInt();
			System.out.println("Escriba la altura: ");
			altura=teclado.nextInt();
			areaTriangulo = (base*altura)/2;
			System.out.println("El area del tri�ngulo es: "+areaTriangulo);
			break;
			
		case 2:
			System.out.println("Escriba el lado: ");
			lado=teclado.nextInt();
			areaCuadrado = Math.pow(lado, 2);
			System.out.println("El area del tri�ngulo es: "+areaCuadrado);
			break;
		
		case 3:
			System.out.println("Escriba la base: ");
			base=teclado.nextInt();
			System.out.println("Escriba la altura: ");
			altura=teclado.nextInt();
			areaRectangulo = (base*altura);
			System.out.println("El area del rect�ngulo es: "+areaRectangulo);
			break;
			
			default:
			System.out.println("El n�mero introducido no es v�lido");


			
		}
		
			
	}

}
