package motori;

public abstract class Motore implements intMotore {
	
	protected int cilindri;
	protected int potenza;
	protected int cilindrata;
	
	public Motore(int cilindri, int cilindrata) {
		this.cilindrata=cilindrata;
		this.cilindri=cilindri;
	}
	
	public int getCilindrata() {
		return this.cilindrata;
	}
	
	public int getPotenza() {
		return this.potenza;
	}
	
}
