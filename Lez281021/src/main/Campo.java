package main;

import main.Prenotazione;

public class Campo {
	/*
	 * 2) Una classe Campo in cui ci sono i seguenti metodi:
		    - public boolean addPrenotazione() per prenotare. L'utente deve fornire           
		    l'orario (inizio e fine) e il propio nominativo.
		    - public boolean removePrenotazione() per cancellare la prenotazione di           
		    un dato cliente   
		       - public String tostring() per ottenere la lista delle prenotazini
	 */
	private Prenotazione[] listaPrenotazione;
	private int lastPrenotazione=0;
	private int precPrenotazione=0;
	
	public Campo(int n)
	{
		this.listaPrenotazione =new Prenotazione[n];
	}
	
	public boolean addPrenotazione(int oraInizio, int oraFine, String nome) {
		this.listaPrenotazione[this.lastPrenotazione]= new Prenotazione(nome,oraInizio);
		this.lastPrenotazione=this.precPrenotazione;
		this.lastPrenotazione++;
		this.precPrenotazione=this.lastPrenotazione;
		return true;
	}
	
	public boolean removePrenotazione(String nome) {
		boolean ret=false;
		for (int i=0;i<this.lastPrenotazione;i++)
		{
			if(nome.equals(this.listaPrenotazione[i].getNome()))
			{
				this.precPrenotazione=this.lastPrenotazione-1;
				this.listaPrenotazione[i]=null;
				this.lastPrenotazione=i;
				ret=true;
			} else {
				ret = false;
			}
		}
		return ret;
	}
	
	public String toString()
	{
		String text="";
		for(int i=0; i<this.lastPrenotazione;i++)
		{
			text += this.listaPrenotazione[i].getNome();
			text += "    ";
			text += this.listaPrenotazione[i].getOraPrenotazione();
			text+= "\n";
		}
		return text;
	}
	

}
