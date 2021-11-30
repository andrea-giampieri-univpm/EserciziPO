package auto;

import java.util.ArrayList;

import motori.Motore;

public abstract class Automobile {
	
	private String targa;
	private String marca;
	private String modello;
	private Motore motore;
	private ArrayList<Optional> opt; 
	
	public Automobile(String targa) {
		this.targa=targa;
	}
	
	protected abstract boolean checkCompatibility(Optional opt);
	
	public void addOptional(Optional opt) {
		if(this.checkCompatibility(opt)) 
			this.opt.add(opt);
	}
	
	public void addOptional(ArrayList<Optional> opts) {
		this.opt.addAll(opts);
	}

}
