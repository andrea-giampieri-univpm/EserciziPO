package main;

import java.time.Instant;
import java.util.Scanner;
import java.time.Duration;


public class Main {

	public static void main(String[] args) {
		/*Scrivere un programma in linguaggio Java che legga da tastiera un numero binario sotto 
		forma di una stringa di caratteri (0 o 1) lunga al massimo 8 bit e la passi ad un metodo 
		ausiliario che restituisca l'equivalente valore in decimale.
		*/
		
		System.out.println("Inserisci una numero binario (8b): ");
		Scanner scan = new Scanner(System.in);
		String numero; 
		
		do
		{
			numero = scan.next();
		
		if (numero.length()>8)//controllo la lunghezza
			System.out.println("Sono un pc obsoleto, massimo 8 bit please");
		
		} while (numero.length()>8);
		
		int decimale = strtodec(numero);
		System.out.println("Il decimale intero di "+numero+" è: "+ decimale);
		scan.close();
	}
	private static int strtodec(String numero)
	{
		Instant t1 = Instant.now();
		int decimale = 0;
		int len=numero.length();
		for (int i=len;i>0;i--)	//ciclo la lunghezza dal massimo a 0 per facilitare il substr
		{
			String supposedbit = numero.substring(i-1,i); //prendo l'ultimo carattere a destra (LSB)
			if (supposedbit.equals("1") || supposedbit.equals("0")) //verifico sia un bit 
			{
				int bit = Integer.parseInt(supposedbit); //converto in int
				decimale+= bit*(Math.pow(2, len-i)); //calcolo la potenza crescente
			} else {
				System.out.println("inserito carattere non valido, supposto bit 1");
				decimale+= (Math.pow(2, len-i));
			}
		}
		
		Instant t2 = Instant.now();
		Duration timeElapsed = Duration.between(t1, t2);
		System.out.println("Time t1: "+ t1.getNano() +" nanos");
		System.out.println("Time t2: "+ t2.getNano() +" nanos");
		System.out.println("Time taken: "+ timeElapsed.getNano() +" nanos");
		return decimale;
	}
	

}
