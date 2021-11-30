package obj;

import java.util.Random;

public class Moneta extends ObjLanciabile {
	
	public boolean launcObj() { //true se lanciato, false se errore
		Random randGen= new Random();
		byte val=(byte) (randGen.nextInt(2));
		super.setOutput(val);
		return true;
		
	}
	
	public String toString() {
		if(super.getOutput()==-1) return "Moneta non lanciata";
		else {
			if(super.getOutput()==0)
				return "il valore della moneta è: Testa";
			else
				return "il valore della moneta è: Croce";
		}
	}
}
