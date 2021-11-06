package humans;
import java.util.ArrayList;

import esame.*;

public class Studente extends Persona {
	private static int progressiveId;
	private byte anno;
	private PianoStudi pianoStudi;
	
	public Studente(String gotName) {
		super(gotName);
		super.id=Studente.progressiveId;
		Studente.progressiveId++;
	}
	
	public String getId() {
		return "S"+this.id;
	}
	
	public PianoStudi getPiano(){
		return this.pianoStudi;
	}

	public boolean addPiano(ArrayList<Esame> gotEsame) {
		if (this.pianoStudi==null) {
			this.pianoStudi = new PianoStudi(gotEsame);
		} else {
			for (Esame eachEsame: gotEsame) {
				this.pianoStudi.addEsame(eachEsame);
			}
		}
		return true;
	}

	public boolean promuovi(Esame gotEsame, byte gotVoto) {
		this.pianoStudi.passEsame(gotEsame, gotVoto);
		return true;
	}
	
	public boolean isLaureabile(short gotCrediti) {
		if(pianoStudi.getCreditiOttenuti()>=gotCrediti && pianoStudi.getCrediti()==pianoStudi.getCreditiOttenuti()) return true;
		return false;
	}
}
