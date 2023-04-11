package figuras;
import java.awt.Color;
/**
 * Clase Figura
 * @author ALUMNO
 * @version 1.0
 */
public abstract class Figura{
	/*Punto centro*/
	private Punto centro;
	/*Color color*/
	private Color color;
	
	/**
	 * Constructor de figura
	 * @param x se le pasa la posicion x
	 * @param y se le pasa la posicion y
	 * @param color se le pasa el color correspondiente
	 */
	public Figura(double x, double y, Color color){
		centro = new Punto (x, y);
		this.color = color;
	}
	
	/**
	 * Metodo para obtener el centro de la figura de la posicion x
	 * @return the x
	 */
	public double getXCentro(){
		return centro.getX();
	}
	
	/**
	 * Metodo para obtener el centro de la figura en la posicion y
	 * @return the y
	 */
	public double getYCentro(){
		return centro.getY();
	}
	
	/**
	 * Metodo para obtener el color de la figura
	 * @return the color
	 */
	public Color getColor(){
		return color;
	}
	
	/**
	 * Metodo para cambiar el valor de la variable de la posicion x
	 * @param x the x to x
	 */
	public void setXCentro(double x){
		centro.setX (x);
	}
	
	/**
	 * Metodo para cambiar el valor de la variable de la posicion y
	 * @param y the y to y
	 */
	public void setYCentro(double y){
		centro.setY (y);
	}
	
	/**
	 * Metodo para cambiar la variable de color de la figura
	 * @param color the color to color
	 */
	public void setColor(Color color){
		this.color = color;
	}
	
	/**
	 * Metodo que devuelve el perimetro de la figura
	 * @return perimetro
	 */
	public abstract double perimetro();  
	
	/**
	 * Metodo que devuelve el area de la figura
	 * @return area
	 */
	public abstract double area();  
	
	/**
	 * Metodo para comparar dos figuras por su area
	 * @param otraFigura que se comparara con la figura
	 * @return un numero 0 si son iguales 1 si es mayor y -1 si es menor
	 */
	public int esMayorQue (Figura otraFigura) {
	   if (this.area() > otraFigura.area()) {
		   return 1;
	   }else {
		   if (this.area() < otraFigura.area()) {
			   return -1;
		   }else {
			   return 0;
		   }
	   }
	}
}
