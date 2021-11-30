package obj;

public class ObjLanciabile {
	private byte output=-1;
	
	public byte getOutput() {
		return this.output;
	}
	
	protected void setOutput(byte gotValue) {
		this.output=gotValue;
	}
	
	public boolean launcObj() { //true se lanciato, false se errore
		return false;
	}
	
	public String toString() {
		return "oggetto non lanciabile";
	}

}
