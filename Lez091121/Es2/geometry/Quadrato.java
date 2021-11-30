package geometry;

public class Quadrato extends Rettangolo{
	
	public Quadrato(double lato) {
		super(lato,lato);
		this.nome="Quadrato";
	}
	
	public double getPerimetro() {
		this.perimetro=this.latolungo*4;
		return this.perimetro;
	}
}
