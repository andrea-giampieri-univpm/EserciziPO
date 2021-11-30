package veicoli;

public class Furgone extends Veicolo{
	private int capacitaCarico;
	
	public int getCapacita() {
		return this.capacitaCarico;
	}
	
	public void setCapacita(int cap) {
		this.capacitaCarico=cap;
	}
	
	public String toString() {
		return "furgone, capacita " +this.capacitaCarico + super.toString();
	}
}
