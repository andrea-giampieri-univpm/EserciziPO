package obj;

import java.util.Random;

public class Dado extends ObjLanciabile {
		
	public boolean launcObj() { //true se lanciato, false se errore
		Random randGen= new Random();
		byte val=(byte) (randGen.nextInt(6)+1);
		super.setOutput(val);
		return true;
	}
	
	public String toString() { 
		if(super.getOutput()==-1) return "Dado non lanciato";
		
		return "il valore del dado è: " + super.getOutput();
	}
}
