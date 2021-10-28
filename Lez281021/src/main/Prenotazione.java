package main;

public class Prenotazione {
	// 1) una classe Prenotazione contenente il nome del cliente e l'ora della sua prenotazione.
	
	private String nome;
	private int oraInizioPrenotazione;
	private int oraFinePrenotazione;
	
	public Prenotazione (String nome, int oraInizio, int oraFine)
	{
		this.nome=nome;
		this.oraInizioPrenotazione=oraInizio;
		this.oraFinePrenotazione=oraFine;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getOraInizioPrenotazione()
	{
		return this.oraInizioPrenotazione;
	}
	
	public int getOraFinePrenotazione()
	{
		return this.oraFinePrenotazione;
	}
	

}
