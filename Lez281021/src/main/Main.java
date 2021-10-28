package main;
import java.util.Scanner;
import main.Campo;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1) una classe Prenotazione contenente il nome del cliente e l'ora della sua prenotazione.
		2) Una classe Campo in cui ci sono i seguenti metodi:
		    - public boolean addPrenotazione() per prenotare. L'utente deve fornire           l'orario (inizio e fine) e il propio nominativo.
		    - public boolean removePrenotazione() per cancellare la prenotazione di           un dato cliente   
		    - public String tostring() per ottenere la lista delle prenotazini
		3) un main che consente al cliente di scegliere quale operazione eseguire
		 */
		
		Campo campo= new Campo(100);
		
		Scanner input = new Scanner(System.in);
		
		int scelta =0;
		do {
			System.out.println("Scegli operazione");
			System.out.println("1 - aggiungi prenotazione");
			System.out.println("2 - rimuovi prenotazione");
			System.out.println("3 - stampa prenotazioni");
			System.out.println("0 - esci");
			
			
			scelta = input.nextInt(); 
			input.nextLine();
			
			switch(scelta)
			{
			case 3:
				{
					System.out.println(campo.toString());
					break;
				}
				
			case 2:
			{
				System.out.println("nome prenotazione: ");
				String text= input.nextLine();
				if(campo.removePrenotazione(text)) System.out.println("rimosso");
				else System.out.println("prenotazione non trovata");
				break;
			}
			
			case 1:
			{
				System.out.println("nome: ");
				String nome= input.nextLine();
				System.out.println("inizio: ");
				int inizio= input.nextInt();
				System.out.println("fine: ");
				int fine= input.nextInt();
				if (campo.addPrenotazione(inizio,fine,nome)) System.out.println("conflitto");
				else System.out.println("inserito");
				break;
			}
			
			}
		} while(scelta!=0);
		System.out.println("bye");
	}

}
