package auto;

public class Optional {
	int prezzo;
	int codice;
	String desc;
	
	public Optional(int prezzo, String desc) {
		this.prezzo=prezzo;
		this.desc=desc;
	}
	
	public String toString() {
		return this.desc + " : "+prezzo;
	}
}
