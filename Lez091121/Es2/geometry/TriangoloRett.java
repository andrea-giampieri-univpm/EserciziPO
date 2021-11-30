package geometry;

public class TriangoloRett extends Triangolo {

	
	public TriangoloRett(double cateto1, double cateto2) {
		super("triangolo rettangolo");
		this.lato1=cateto1;
		this.lato2=cateto2;
		
		double ipotenusa = Math.pow(cateto1, 2)+Math.pow(cateto2,2);
		
		this.lato3=Math.sqrt(ipotenusa);
	}
		
}
