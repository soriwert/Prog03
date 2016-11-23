import java.util.Scanner;
public class ejercicio12 {
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		
		double base=0, areaCuadrado=0, areaRectangulo=0, areaTriangulo=0, altura=0, lado=0;
		int eleccion;
		
		System.out.println("Elija una figura seleccionando su número: ");
		System.out.println("1 Triángulo. \n2 Cuadrado. \n3 Rectángulo");
		eleccion=teclado.nextInt();
		switch (eleccion){
		case 1:
			
			System.out.println("Escriba la base: ");
			base=teclado.nextInt();
			System.out.println("Escriba la altura: ");
			altura=teclado.nextInt();
			areaTriangulo = (base*altura)/2;
			System.out.println("El area del triángulo es: "+areaTriangulo);
			break;
			
		case 2:
			System.out.println("Escriba el lado: ");
			lado=teclado.nextInt();
			areaCuadrado = Math.pow(lado, 2);
			System.out.println("El area del triángulo es: "+areaCuadrado);
			break;
		
		case 3:
			System.out.println("Escriba la base: ");
			base=teclado.nextInt();
			System.out.println("Escriba la altura: ");
			altura=teclado.nextInt();
			areaRectangulo = (base*altura);
			System.out.println("El area del rectángulo es: "+areaRectangulo);
			break;
			
			default:
			System.out.println("El número introducido no es válido");


			
		}
		
			
	}

}
