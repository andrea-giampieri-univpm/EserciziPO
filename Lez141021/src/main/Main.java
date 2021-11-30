package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("****RUNNING ES1*****");
		es1();
		System.out.println("\n\n****RUNNING ES2*****");
		es2();
		System.out.println("\n\n****RUNNING ES3*****");
		
	}
	
	/*
	 * Esercizio 3
		Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza di interi
		terminata quando l’utente immette il valore 0; poi stampa "OK" se la sequenza contiene un valore
		positivo seguito da uno negativo, altrimenti stampa il messaggio "NO".
		Variante: faccio interrompere l’inserimento dei valori anche appena trovo un valore positivo seguito
		da quello negativo.
	 */
	public static void es3() {
		
	}
	
	/*
	 * 	ES2 Scrivere un programma ContinuaFino che chiede all’utente di inserire una
		sequenza di interi. Il programma continua a chiedere all’utente di
		inserire valori fintanto che i valori inseriti soddisfano almeno una
		delle seguenti condizioni:
		- è negativo e divisibile per 2
		- è positivo e divisibile per 3
		Al termine il programma stampa la somma di tutti i valori inseriti
		escluso quello che ha violato le condizioni.
	 */
	
	public static void es2() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci, stronzo: ");
		int somma=0;
		boolean cond=false;
		do {
			int n = input.nextInt();
			cond = (n<0 && n%2==0) || (n>=0 && n%3==0);
			if(cond) somma+=n;
		} while (cond);
		System.out.println(somma);
		input.close();
	}
	
	/* ES1 Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una sequenza di 
	 * interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento 
	 * dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e 
	 * pari, altrimenti stampa "NO".
	*/
	public static void es1() {
		Scanner input = new Scanner(System.in);
		System.out.println("quanti numeri? ");
		int numero=0;
		try {
		numero = input.nextInt();
		}catch(Exception e){
			
		}finally {
			System.out.println("quanti numeri? ");
		}
		boolean status = true;
		for (int i=0;i<numero;i++) {
			System.out.print("inserisci numero: ");
			int n = input.nextInt();
			if(n<0 && n%2!=0) status=false;
		}
		if (status) System.out.println("pari e positivi ");
		else System.out.println("non tutti pari o negativi ");
		input.close();
	}
}
