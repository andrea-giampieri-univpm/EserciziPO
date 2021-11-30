package geometry;

public class Rettangolo extends Figura{
	protected double latolungo;
	protected double latocorto;

	
	
	public Rettangolo(double latolungo, double latocorto) {
		super("rettangolo");
		this.latocorto=latocorto;
		this.latolungo=latolungo;
	}
	
	public double getPerimetro() {
		this.perimetro=(this.latocorto+this.latolungo)*2;
		return this.perimetro;
	}
	
	public double getArea() {
		this.area=this.latocorto*this.latolungo;
		return this.area;
	}
}
