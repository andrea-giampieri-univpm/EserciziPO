package gestioneBanca;
import java.util.Scanner;

import gestioneBanca.Utente;
import gestioneBanca.ContoCorrente;

public class TerminaleSportello {
	
	private Scanner scan;
	private int menu;
	private Utente currentuser;
	
	public TerminaleSportello() {
		this.scan = new Scanner(System.in);
		this.currentuser= this.register(); // creo nuovo utente
		//richiedo login
		while (!this.login(this.currentuser))
		{
			System.out.println("Devi loggarti per usare il sw");
		}
	
		do {
			this.menu= this.showMenu();
			ContoCorrente cc = new ContoCorrente('F');
			switch (menu) {
			case 2:
				System.out.println("il saldo dopo operazione è: "+cc.versa(this.scan.nextInt()));
				break;
			case 3:
				System.out.println("il saldo dopo operazione è: "+cc.preleva(this.scan.nextInt()));
				break;
			case 4:		
				System.out.println("il saldo dopo gli interessi è: "+cc.matint());
				break;
			case 5:
				System.out.println("il saldo attuale è: "+ cc.saldo());
				break;
			case 6:
				System.out.println("il numero di conto attuale è: "+ cc.num());
				break;
			case 7:
				System.out.println("inserisci il nuovo valore:");
				System.out.println("il nuovo valore è: "+cc.modificatassofam(this.scan.nextInt()));
				break;
			case 8:
				System.out.println("inserisci il nuovo valore:");
				System.out.println("il nuovo valore è: "+cc.modificatassobiz(this.scan.nextInt()));
				break;
			}
		}while (menu!=1);
	
	this.logout();
	}
	
	private int showMenu() {
		System.out.println("Cosa vuoi fare? ");
		System.out.println("1 - Logout ");
		System.out.println("2 - Versa ");
		System.out.println("3 - Preleva ");
		System.out.println("4 - Matura interessi ");
		System.out.println("5 - Ottieni saldo ");
		System.out.println("6 - Ottieni numero ");
		System.out.println("7 - Modifica tasso family ");
		System.out.println("8 - Modifica tasso business ");
		return scan.nextInt();
	}
	
	private Utente register() {
		System.out.println("Inserisci utente: ");
		String username= scan.nextLine();
		System.out.println("Inserisci utente: ");
		String password= scan.nextLine();
		Utente utente = new Utente(username,password);
		return utente;
	}
	
	private boolean login(Utente utente) {
		boolean login=false;
		System.out.println("Inserisci utente: ");
		String username= scan.nextLine();
		System.out.println("Inserisci utente: ");
		String password= scan.nextLine();
		login= utente.authenticate(username, password);		
		return login;
	}
	
	private void logout() {
		System.out.println("Sessione terminata");
		scan.close();
	}

}
