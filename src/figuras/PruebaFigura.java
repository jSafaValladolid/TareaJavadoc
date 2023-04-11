package figuras;

import java.util.Scanner;
import java.awt.Color;

/**
 * Ejempo para probar figuras
 * @author ALUMNO
 * @version 1.0
 */
public class PruebaFigura {
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		Scanner teclado = new Scanner (System.in);
		do { 
			opcion = mostrarMenu();
			if (opcion != 4){
				System.out.print ("Introduzca la coordenada x del centro: ");
				double x = teclado.nextDouble();
				System.out.print ("Introduzca la coordenada y del centro: ");
				double y = teclado.nextDouble();
				switch (opcion) {
				case 1:
					System.out.print ("Introduzca el lado 1 del triángulo: ");
					double lado1 = teclado.nextDouble();
					System.out.print ("Introduzca el lado 2 del triángulo: ");
					double lado2 = teclado.nextDouble();
					System.out.print ("Introduzca el lado 3 del triángulo: ");
					double lado3 = teclado.nextDouble();
					Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
					System.out.println ("El per�metro es " + t.perimetro());
					System.out.println ("El �rea es " + t.area());
				break;
				case 2:
					System.out.print ("Introduzca la base del rectángulo: ");
					double base = teclado.nextDouble();
					System.out.print ("Introduzca la altura del rectángulo: ");
					double altura = teclado.nextDouble();
					Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
					System.out.println ("El per�metro es " + r.perimetro());
					System.out.println ("El �rea es " + r.area());
				break;
				case 3:
					System.out.print ("Introduzca el lado del cuadrado: ");
					double lado = teclado.nextDouble();
					Cuadrado c = new Cuadrado(x, y, Color.red, lado);
					System.out.println ("El perímetro es " + c.perimetro());
					System.out.println ("El área es " + c.area());
				break;
}
	   }
	}while (opcion != 4); 
		teclado.close();
	}
	
	/**
	 * Metodo para mostrar las figuras
	 */
	public static int mostrarMenu(){
		int opcionVariable;
		System.out.println ("1) Tri�ngulo");
		System.out.println ("2) Rect�ngulo");
		System.out.println ("3) Cuadrado");
		System.out.println ("4) Salir");
		Scanner teclado = new Scanner (System.in);
		do {
		    System.out.print ("Introduzca una opción (1-4): ");
		    opcionVariable = teclado.nextInt();
		    if (opcionVariable < 1 || opcionVariable > 4)
			   System.out.println ("Debe introducir un número entre 1 y 4");
		   } while (opcionVariable < 1 || opcionVariable > 4);
		return opcionVariable;
	}
}
