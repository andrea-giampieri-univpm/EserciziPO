package main;

public class Prenotazione {
	// 1) una classe Prenotazione contenente il nome del cliente e l'ora della sua prenotazione.
	
	private String nome;
	private int oraPrenotazione;
	
	public Prenotazione (String nome, int ora)
	{
		this.nome=nome;
		this.oraPrenotazione=ora;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getOraPrenotazione()
	{
		return this.oraPrenotazione;
	}
	

}
