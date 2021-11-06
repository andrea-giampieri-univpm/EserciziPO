package esame;

import java.time.ZonedDateTime;


public class Esame {

	private String name;
	private String examiner; //volutamente private, suppongo (per prova) di non poter mai cambiare l'esaminatore
	private byte voto; //-1 indica nessun voto, le subclass possono accedervi ma esternamente va usato il metodo isvaluable
	private ZonedDateTime scheduledDT; //data e ora di appello
	private byte crediti; 
	
	public Esame(String gotNome, String gotEsaminatore){
		this.examiner=gotEsaminatore;
		this.name=gotNome;
		this.voto=-1;
		this.crediti=0;
	}
	
	public Esame(String gotNome,String gotEsaminatore, byte gotVoto, byte gotCrediti){
		this.examiner=gotEsaminatore;
		this.name=gotNome;
		this.voto=gotVoto;
		this.crediti=gotCrediti;
	}

	public String getNome() {
		return this.name;
	}
	
	public String getEsaminatore() {
		return this.examiner;
	}
	
	public boolean isValuable () { //se fa media cioè se ha voto
		if(this.voto==-1) return false;
		else return true;
	}
	
	public byte getVoto() { //inserito per prova override, alcuni metodi utilizzano l'oggetto esame senza sapere quale tipo di esame sia
		return this.voto;
	}
	
	public boolean setTime(String gotDateTime) { //boolean per ritornare un eventuale errore con try catch
		try {
			this.scheduledDT = ZonedDateTime.parse(gotDateTime + "+01:00[Europe/Rome]");
		} catch (Exception DateTimeParseException) {
			return false;
		}
		return true;
	}
	
	public String getTime() { //come stringa per semplificare
		String time ="Data: ";
		time +=this.scheduledDT.getDayOfMonth()+"-" ;
		time +=this.scheduledDT.getMonthValue()+"-";
		time +=this.scheduledDT.getYear();
		time+=" \n Orario: ";
		time +=this.scheduledDT.getHour();
		time +=this.scheduledDT.getMinute();
		return time;
	}
	
	public boolean isOvertime() { //se è passato o futuro rispetto ad adesso
		ZonedDateTime now = ZonedDateTime.now();
		if(this.scheduledDT.isAfter(now)) return false;
		return true;
	}
	
	public byte getCrediti() {
		return this.crediti;
	}
	
	public void setVoto(byte gotVoto) {
		this.voto=gotVoto;
	}
}


