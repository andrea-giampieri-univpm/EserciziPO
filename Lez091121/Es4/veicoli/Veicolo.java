package veicoli;

public class Veicolo {
	private int annoimm;
	private String marca;	
	
	public int getAnnoimm() {
		return this.annoimm;
	}
	
	public void setAnnoimm(int anno) {
		this.annoimm=anno;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String toString() {
		return " anno: "+this.annoimm+" marca: " + this.marca;
	}
}
