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
	private Prenotazione[] listaPrenotazione; //array di prenotazioni: 1 campo ha n prenotazioni possibili stimato a 24 per gg
	private int lastPrenotazione=0; //progressivo indice ultima prenotazione inserita
	private int emptyIndex=0;
	
	public Campo(int n)
	{
		this.listaPrenotazione =new Prenotazione[n]; //inizializzazione array a lunghezza n
	}
	
	public boolean addPrenotazione(int oraInizio, int oraFine, String nome) {
		boolean conflict=false;
		for(int i=0; i<this.lastPrenotazione;i++)
		{
			if(listaPrenotazione[i]!=null) {
				int oraprenotata= this.listaPrenotazione[i].getOraInizioPrenotazione();
				if(oraprenotata<=oraFine && oraprenotata>=oraInizio) 
					conflict=true;
			} else {
				if (i<this.emptyIndex) this.emptyIndex=i;
			}
		}
		
		if(!conflict) {
				if (emptyIndex!=lastPrenotazione) {
					this.listaPrenotazione[this.emptyIndex]= new Prenotazione(nome,oraInizio, oraFine);
					this.emptyIndex=this.lastPrenotazione;
				} else {
					this.listaPrenotazione[this.lastPrenotazione]= new Prenotazione(nome,oraInizio, oraFine);
					this.lastPrenotazione++;
					this.emptyIndex++;
				}
				
			//this.lastPrenotazione=this.precPrenotazione;	
			//this.precPrenotazione=this.lastPrenotazione;
		}
		return conflict;
	}
	
	
	public boolean removePrenotazione(String nome) { //se rimuovo più di 1 elemento lascio dei buchi
		boolean remove=false;
		for (int i=0;i<this.lastPrenotazione && !remove;i++)
		{
			if(this.listaPrenotazione[i]!=null && nome.equals(this.listaPrenotazione[i].getNome()))
			{
				this.listaPrenotazione[i]=null;
				remove=true;
			} else {
				remove = false;
			}
		}
		return remove;
	}
	
	public String toString()
	{
		String text="";
		for(int i=0; i<this.lastPrenotazione;i++)
		{
			if(listaPrenotazione[i]!=null) 
			{
				text += this.listaPrenotazione[i].getNome();
				text += "    ";
				text += this.listaPrenotazione[i].getOraInizioPrenotazione();
				text+= "\n";
			}
		}
		return text;
	}

}
