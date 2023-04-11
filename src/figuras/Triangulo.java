package figuras;

import java.awt.Color;

/**
 * Clase Triangulo
 * @author ALUMNO
 * @version 1.0
 */
public class Triangulo extends Figura{
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * Contructor para crea objeto Trianbgulo
	 * @param x
	 * @param y
	 * @param color
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
		super (x, y, color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	/**
	 * Metodo para obtener lado1
	 * @return the lado1
	 */
	public double getLado1(){
		return lado1;
	}
	
	/**
	 * Metodo para obtener lado2
	 * @return the lado2
	 */
	public double getLado2(){
		return lado2;
	}
	
	/**
	 * Metodo para obtener lado3
	 * @return the lado3
	 */
	public double getLado3(){
		return lado3;
	}
	
	/**
	 * Metodo para cambiar el lado1 por el paramentro
	 * @param lado1 the lado1 to lado1
	 */
	public void setLado1(double lado1){
		this.lado1 = lado1;
	}
	
	/**
	 * Metodo para cambiar el lado2 por el parametro
	 * @param lado2 the lado2 to lado2
	 */
	public void setLado2(double lado2){
		this.lado2 = lado2;
	}
	
	/**
	 * Metodo para cambiar el lado3 por el parametro
	 * @param lado3 the lado3 to lado3
	 */
	public void setLado3(double lado3){
		this.lado3 = lado3;
	}
	
	/**
	 * Metodo que devuelve el perimetro
	 * @return perimetro
	 */
	public double perimetro (){
	   return lado1 + lado2 + lado3;
	}
	
	/**
	 * Metodo que devuelve el area
	 * @return area
	 */
	public double area (){ 
	   double sp = perimetro() / 2;
	   return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
	}
}
