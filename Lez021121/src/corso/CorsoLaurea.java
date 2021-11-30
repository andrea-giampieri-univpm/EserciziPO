package corso;
//1
import java.util.ArrayList;
import java.util.Objects;

import humans.Studente;

public class CorsoLaurea {

	private short minCrediti;
	private String name;
	private ArrayList<Studente> iscritti;
	private ArrayList<Studente> iscrittiLaureati; //asd asd
	
	
	public CorsoLaurea(String gotName, short gotMinCrediti) {
		this.name=gotName;
		this.minCrediti=gotMinCrediti;
	}

	public String getName() {
		return this.name;
	}

	public void iscrivi(Studente gotStudente) { //iscrive lo studente al corso
		this.iscritti.add(gotStudente);
	}
	public Studente cercaStudente(Studente gotStudente) { //cerco per oggetto
		for (Studente eachStudente: iscritti) {
			if(Objects.equals(eachStudente, gotStudente))
				return eachStudente;
		}
		return null;
	}

	public Studente cercaStudente(String gotNameStudente) { //cerco per nome
		for (Studente eachNomeStudente: iscritti) {
			if(eachNomeStudente.getNome().equals(gotNameStudente))
				return eachNomeStudente;
		}
		return null;
	}
	public void ritiraStudente(Studente gotStudente) {
		this.iscritti.removeIf(eachStudente -> gotStudente.equals(eachStudente));
	}

	public boolean laureaStudente(Studente gotStudente) {
		if (this.cercaStudente(gotStudente).isLaureabile(this.minCrediti)) {
			this.iscrittiLaureati.add(gotStudente);
			this.ritiraStudente(gotStudente);
			return true;
		}
		return false;
	}




}

