package garage;

import veicoli.Veicolo;

public class Garage {
	final private byte g=15;
	private Veicolo[] veicoli = new Veicolo[g];
	
	public int immetti(Veicolo v) {
		int ret=-1;
		for(int i=0;i<g && (ret==-1);i++) 
		{
			if (this.veicoli[i]==null) 
			{
				this.veicoli[i]=v;
				ret=i;
			}
		}
		return ret;
	}
	
	public Veicolo estrai(int p) {
		Veicolo v;
		try {
			v=this.veicoli[p-1];
			this.veicoli[p-1]=null;
		}catch(Exception e) {
			v=null;
		}
		return v;
	}
	
	public String stampa() {
		String s="";
		for(int i=0;i<g;i++) {
			if(veicoli[i]!=null) s=s+" "+(i+1)+": "+veicoli[i].toString()+"\n";
			else s=s+" "+(i+1)+"posto vuoto \n";
		}
		return s;
	}

}
