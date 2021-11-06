package humans;

public class Professore extends Persona {
	private static int progressiveId;
	
	public Professore(String gotName) {
		super(gotName);
		super.id=Professore.progressiveId;
		Professore.progressiveId++;
	}

	public String getId() {
		return "P"+this.id;
	}
}
