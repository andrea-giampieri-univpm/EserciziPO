package obj;

import java.util.Random;

public class ObjAzzardo {
	
	private Random randGen= new Random();
	private byte output=-1;
	private byte max;

	public byte getOutput() {
		return this.output;
	}
	
	public void lanciaDado() {
		this.max=7;
		this.output=(byte) (randGen.nextInt(6)+1);
	}
	
	public void lanciaMoneta() {
		this.max=2;
		this.output=(byte) (randGen.nextInt(2));
	}
	
	public String toString() {
		String out="oggetto non lanciabile";
		if(this.max>2) out="Il valore del dado è: "+this.output;
		else {
			if(this.output==0) out="Il valore della moneta è: Croce";
			if(this.output==1) out="Il valore della moneta è: Testa";
		}
		return out;
	}
}
