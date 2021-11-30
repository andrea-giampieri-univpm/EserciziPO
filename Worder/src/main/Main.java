package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Scrivere un programma in linguaggio Java che legga da tastiera una frase e una parola, 
		queste devono essere passate ad un metodo ausiliario che restituisce il numero di occorrenze 
		della parola nella frase.
		 */
		System.out.println("Inserisci una frase: ");
		Scanner scan = new Scanner(System.in);
		String frase = scan.nextLine();
		System.out.println("Inserisci una parola da cercare: ");
		String parola= scan.next();
		scan.close();
		if (!frase.isEmpty() && !parola.isEmpty()) //verifico che ci siano le stringhe necessarie
		{
			int occorrenze = cercaOccorrenze(frase,parola);
			System.out.println("Il numero di occorrenze della parola "+parola+" nella frase è: "+ occorrenze);
			occorrenze = cercaOccorrenzeSPL(frase,parola);
			System.out.println("Il numero di occorrenze trovate con split() della parola "+parola+" nella frase è: "+ occorrenze);
		} else {
			System.out.println("Inserisci qualcosa please...");
		}
	}
	
	//conta occorrenze di "parola" in "frase"
	private static int cercaOccorrenze (String frase, String parola) {
		int occorrenze=0; //numero occorrenze
		int indiceFrase =frase.indexOf (" ",1); // indice scorrimento spazi frase, lo inizializzo al primo spazio
		int indiceFrasePrev=0; //indice scorrimento spazi precednete (ovvero l'indice dell'ultimo carattere letto)
		
		while (indiceFrase != -1) { //controllo se sono a fine stringa anche per evitare il substring su -1
			if(parola.equals(frase.substring(indiceFrasePrev, indiceFrase))) //verifico la stringa con la sottostringa contenente la parola
				occorrenze++;
			indiceFrasePrev = indiceFrase+1; //k prende il valore dell'ultimo carattere + lo spazio
			indiceFrase = frase.indexOf (" ",indiceFrase +1); //trovo lo spazio a partire dal carattere successivo
		}  
			
		if(parola.equals(frase.substring(indiceFrasePrev, frase.length()))) //effettuo controllo per l'ultima parola usando il fine stringa
			occorrenze++;
		
		return occorrenze;
	}
	
	private static int cercaOccorrenzeSPL (String frase, String parola) {
		int count=0; //numero occorrenze
		String[] parole = frase.split(" ");
		for (String s : parole)
		{
			if(s.equals(parola)) count++;
		}
		return count;
	}
}
