package geometry;

public class Figura {
	protected double perimetro;
	protected double area;
	protected String nome;
	
	public Figura(String gotNome) {
		this.nome=gotNome;
	}
	
	public double getPerimetro() {
		return this.perimetro;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public String toString() {
		return "Figura: "+this.nome+"\n il perimetro è: "+this.perimetro + " \n l'area è: "+area;
	}
}