package figuras;

import java.awt.Color;
/**
 * Clase Cuadrado
 * @version 1.0
 * @author ALUMNO
 */
public class Cuadrado extends Rectangulo{
	/**
	 * Constructor para crear un cuadrado
	 * @param x se le pasa la posicion x
	 * @param y se le pasa la posicion y
	 * @param color se le pasa el color correspondiente
	 * @param lado se le pasa el tamaño del lado
	 */
	public Cuadrado (double x, double y, Color color, double lado){
		super (x, y, color, lado, lado);
	}
}
