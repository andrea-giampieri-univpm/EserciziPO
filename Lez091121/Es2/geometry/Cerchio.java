package geometry;

public class Cerchio extends Figura{
	private double radius;
	private double diametro;
	
	public Cerchio (double r) {
		super("cerchio");
		this.radius=r;
		this.diametro=2*r;
	}
	
	public double getPerimetro() {
		this.perimetro=Math.PI * this.diametro;
		return this.perimetro;
	}
	
	public double getArea() {
		this.area=Math.pow(radius,2)*Math.PI*2;
		return this.area;
	}
}
