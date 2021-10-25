package gestioneBanca;

public class ContoCorrente {
	private static int tassofamily;
	private static int tassobiz;
	private static int lastnumconto=0;
	private int numeroconto;
	private double saldo;
	private char type;
	
	public ContoCorrente(char type) {
		this.saldo=0;
		this.type=type;
		this.numeroconto=lastnumconto;
		lastnumconto++;
	}
	
	public double versa(double value) {
		this.saldo+=value;
		return this.saldo;
	}
	public double preleva(double value) {
		this.saldo-=value;
		return this.saldo;
	}
	public double matint() {
		if(this.type=='F') this.saldo= this.saldo*tassofamily/100;
		if(this.type=='B') this.saldo= this.saldo*tassobiz/100;
		return this.saldo;
	}
	public double saldo() {
		return this.saldo;
	}
	public int num() {
		return this.numeroconto;
	}
	public int modificatassofam(int value) {
		ContoCorrente.tassofamily=value;
		return ContoCorrente.tassobiz;
	}
	public int modificatassobiz(int value) {
		ContoCorrente.tassobiz=value;
		return ContoCorrente.tassobiz;
	}
}
