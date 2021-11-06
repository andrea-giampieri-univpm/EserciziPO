package humans;

public class Persona {
	private String nome; 
	protected int id;
	
	public Persona(String gotNome) { 
		this.nome = gotNome;
		this.id=-1;
	}
	
	public String getNome() { 
		return nome; 
	}
		
	public String toString() {
		return "Nome: " + this.nome;
	}
	
	}