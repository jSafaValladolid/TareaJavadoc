package figuras;

import java.awt.Color;

public class Rectangulo extends Figura{
	/*double base*/
	private double base;
	/*double altura*/
	private double altura;
	
	/**
	 * Metodo para crear un rectangulo
	 * @param x
	 * @param y
	 * @param color
	 * @param base
	 * @param altura
	 */
	public Rectangulo (double x, double y, Color color, double base, double altura){
		super (x, y, color);
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * Metodo que devuelve la base del rectangulo
	 * @return the base
	 */
	public double getBase(){
		return base;
	}
	
	/**
	 * Metodo que devuleve la altura del rectangulo
	 * @return the altura
	 */
	public double getAltura(){
		return altura;
	}
	
	/**
	 * Metodo que cambia la base por otra
	 * @param base the base to set
	 */
	public void setBase(double base){
		this.base = base;
	}
	
	/**
	 * Metodo que cambia la altura por otra
	 * @param altura the altura
	 */
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	/**
	 * Metodo que devuelve el perimetro
	 * @return perimetro
	 */
	public double perimetro (){
	   return 2 * base + 2 * altura;
	}
	
	/**
	 * Metodo que devuelve el area
	 * @return area
	 */
	public double area (){ 
	   return base * altura;
	}
}
