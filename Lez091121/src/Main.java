import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import garage.Garage;
import obj.*;
import veicoli.*;

public class Main {

	public static void main(String[] args) {
		//for (int i=0; i<10;i++) {
		//	System.out.println("iter :"+i);
			/*
			ObjLanciabile obj=new ObjLanciabile();
			System.out.println(obj.getOutput());
			System.out.println(obj);
			obj.launcObj();
			System.out.println(obj);
			System.out.println(obj.getOutput());
			*/
			/*
			Dado dado=new Dado();
			System.out.println(dado.getOutput());
			System.out.println(dado);
			dado.launcObj();
			System.out.println(dado);
			System.out.println(dado.getOutput());
			*/
			/*
			Moneta moneta = new Moneta();
			System.out.println(moneta.getOutput());
			System.out.println(moneta);
			moneta.launcObj();
			System.out.println(moneta);
			System.out.println(moneta.getOutput());
			*/
			/*
			ObjAzzardo azzardo = new ObjAzzardo();
			System.out.println(azzardo.getOutput());
			System.out.println(azzardo);
			azzardo.lanciaDado();
			System.out.println(azzardo.getOutput());
			System.out.println(azzardo);
			azzardo.lanciaMoneta();
			System.out.println(azzardo.getOutput());
			System.out.println(azzardo);
			System.out.println("end iter \n");
			*/
			
		//}
	Scanner input = new Scanner(System.in);
	Garage garage= new Garage();
	int scelta;
	Veicolo v;
	do {	
		System.out.println("0- esci, 1- inserisci auto, 2- inserici furgone, 3- libera posto, 4-stampa");
		try {
		scelta=input.nextInt(); 
		} 
		catch (Exception e) {
			 System.out.println(e);
			 System.out.println("cazzo scrivi?");
			 scelta =1;
		}finally {
			input.nextLine();
		}
		
		switch(scelta) {
		case 1:
			v=new Auto();
			System.out.println("marca: ");
			v.setMarca(input.nextLine());
			System.out.println("anno: ");
			v.setAnnoimm(input.nextInt()); input.nextLine();
			System.out.println("porte: ");
			((Auto) v).setPorte(input.nextInt());input.nextLine();
			if(garage.immetti(v)==-1) System.out.println("errore inserimento");
			break;
		case 2:
			v=new Furgone();
			System.out.println("marca: ");
			v.setMarca(input.nextLine());
			System.out.println("anno: ");
			v.setAnnoimm(input.nextInt()); input.nextLine();
			System.out.println("capacita carico: ");
			((Furgone) v).setCapacita(input.nextInt());input.nextLine();
			if(garage.immetti(v)==-1) System.out.println("errore inserimento");
			break;
		case 3:
			int posto = input.nextInt(); input.nextLine();
			if(garage.estrai(posto)==null) System.out.println("posto non occupato/occupabile");;
			break;
		case 4:
			System.out.println(garage.stampa());
			break;
		}
	}while(scelta!=0);
	
	input.close();
	
	}

}
