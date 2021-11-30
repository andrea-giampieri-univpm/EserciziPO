package veicoli;

public class Auto extends Veicolo {
	private int numporte;
	
	public int getPorte() {
		return this.numporte;
	}
	
	public void setPorte(int porte) {
		this.numporte=porte;
	}
	
	public String toString() {
		return "auto, porte " +this.numporte + super.toString();
	}
}
