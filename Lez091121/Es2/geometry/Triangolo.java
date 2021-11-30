package geometry;

public class Triangolo extends Figura {
	protected double lato1;
	protected double lato2;
	protected double lato3;
		
	protected Triangolo(String gotName) {
		super(gotName);
	}
	
	public Triangolo(double lato1, double lato2, double lato3) {
		super("Triangolo");
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
	}
	
	public double getPerimetro() {
		this.perimetro=lato1+lato2+lato3;
		return this.perimetro;
	}
	
	public double getArea() {
		if(perimetro==0) this.getPerimetro();
		double mp=this.perimetro/2;
		this.area=Math.sqrt(mp*(mp-lato2)*(mp-lato3)*(mp-lato1));
		return this.area;
	}
}
