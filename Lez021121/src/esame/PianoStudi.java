package esame;
import java.util.ArrayList;
import java.util.Objects;

public class PianoStudi {
	private ArrayList<Esame> esami = new ArrayList<Esame>();
	private ArrayList<Esame> esamiCompletati = new ArrayList<Esame>();
	private short crediti;
	private short creditiOttenuti;
	
	public PianoStudi(Esame gotEsame) {
		this.addEsame(gotEsame);
	}
	
	public PianoStudi(ArrayList<Esame> gotEsame) {
		for (Esame eachEsame: gotEsame) {
			this.addEsame(eachEsame);
		}
	}
	
	public byte getVoto(Esame gotEsame) {
		byte voto=-1;
		for (Esame eachEsame: esami) {
			if(Objects.equals(eachEsame, gotEsame))
				voto= eachEsame.getVoto();
		}
		return voto;
	}
	
	public short getCrediti() {
		return this.crediti;
	}
	
	public short getCreditiOttenuti() {
		return this.creditiOttenuti;
	}
	
	public boolean addEsame(Esame gotEsame) {
		this.crediti+=gotEsame.getCrediti();
		return this.esami.add(gotEsame);
	}
	
	public boolean removeEsame(Esame gotEsame) {
		this.crediti-=gotEsame.getCrediti();
		return this.esami.removeIf(eachEsame -> gotEsame.equals(eachEsame));
	}
	
	public boolean hasEsame(Esame gotEsame) {
		return this.esami.contains(gotEsame);
	}
	
	public void passEsame(Esame gotEsame,byte gotVoto) {
		for (Esame eachEsame: this.esami) {
			if(Objects.equals(eachEsame, gotEsame))
				eachEsame.setVoto(gotVoto);
				this.creditiOttenuti+=gotEsame.getCrediti();
				this.esamiCompletati.add(gotEsame);
				this.removeEsame(gotEsame);
		}
	}
}

