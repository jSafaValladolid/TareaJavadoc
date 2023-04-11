package figuras;
/**
 * Case punto
 * @author ALUMNO
 * @version 1.0
 */
public class Punto {
	/*double x*/
	private double x;
	/*double y*/
	private double y;
	
	/**
	 * Constuctor vacio crea un punto en (0, 0)
	 */
	public Punto(){
		x = 0;
		y= 0;
	}
	
	/**
	 * Constructor de un punto crea un punto en (x, y)
	 * @param x
	 * @param y
	 */
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Metodo para cambiar la posicion de un punto por otro
	 * @param p otro punto del cual se toman sus paramentros de posicion
	 */
	public Punto(Punto p){
		x = p.x;
		y = p.y;
	}
	
	/**
	 * Metodo para obtener la posicion en x
	 * @return the x
	 */
	public double getX(){
		return x;
	}
	
	/**
	 * Metodo para obtener la posicion y
	 * @return the y
	 */
	public double getY(){
		return y;
	}
	
	/**
	 * Metodo para cambiar la posicion de la variable de posicion x
	 * @param x the x to x
	 */
	public void setX(double x){
		this.x = x;
	}
	
	/**
	 * Metodo para cambiar la posicion de la variable de posicion y
	 * @param y the y to y
	 */
	public void setY(double y){
		this.y = y;
	}
	
	/**
	 * Metodo para calcular la distancia entre dos puntos
	 * @param p se le pasa otro punto 
	 * @return devuelve la distancia entre ambos puntos
	 */
	public double distancia(Punto p){
		return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
	
	/**
	 * Metodo para clacular el punto simetrico a otro punto
	 * @return devuelve el punto simetrico al punto
	 */
	public Punto simetrico(){
		Punto nuevoP = new Punto (this.x * -1, this.y);	
		return nuevoP ;
	}
	
	/**
	 * Metodo para saber si dos puntos son iguales
	 * @param p se le pasa el punto que se quiere comprobar
	 * @return devuelve true en el caso de que sean iguales y false en el caso de que sean diferentes
	 */
	public boolean compara(Punto p){
		if (p.x == x && p.y == y) {
		   return true;
		}else {
		   return false;
		}
	}
	
	/**
	 * Metodo que pasa la variabel punto a un string (x,y)
	 */
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}
