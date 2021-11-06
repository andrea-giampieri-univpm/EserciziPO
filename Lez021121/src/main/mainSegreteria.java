package main;
import esame.*;

import java.util.ArrayList;

import corso.CorsoLaurea;
import humans.*;

public class mainSegreteria {

	public static void main(String[] args) {
		//Variabili per test
		byte cfu=9;
		short crediti=180;
		byte voto = 19;
		ArrayList<Esame> arrayesami = new ArrayList<Esame>();
		
		System.out.println("*** test istanziamento e costruttori ***");
		//test istanziamento e costruttori
		Studente stud = new Studente("studente");
		CorsoLaurea corso = new CorsoLaurea("info", crediti);
		Esame esame = new Esame("analisi", "colucci");
		Esame esame2 = new Esame("analisi2", "isernia", voto, cfu);
		
		
		arrayesami.add(esame);
		arrayesami.add(esame2);
		
		PianoStudi piano = new PianoStudi(esame);
		PianoStudi piano2 = new PianoStudi(arrayesami);
				
		
		System.out.println("### Istanziamento e costruttori eseguiti ###");
		System.out.println("*** test classe studente ***");
		stud.addPiano(arrayesami); //piu opportuno crea piano
		stud.getId();
		stud.getNome();
		stud.getPiano();
		stud.isLaureabile(crediti);
		stud.promuovi(esame2, voto);
		stud.toString();
		stud.promuovi(esame, voto); 
		System.out.println("### test classe studente eseguito ###");
		
		
	}

}
