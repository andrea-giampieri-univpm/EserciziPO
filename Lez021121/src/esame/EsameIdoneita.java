package esame;

public class EsameIdoneita extends Esame {
	
	protected boolean idoneo;
	
	public EsameIdoneita (String gotNome,String gotEsaminatore){
		super(gotNome,gotEsaminatore);
		this.idoneo=false;
	}
	
	public EsameIdoneita (String gotNome,String gotEsaminatore,boolean gotIdoneo){
		super(gotNome,gotEsaminatore);
		this.idoneo=gotIdoneo;
	}
	
	public void setIdoneo(boolean gotIdoneo) {
		this.idoneo=gotIdoneo;
	}
	
	public boolean isIdoneo() {
		return this.idoneo;
	}
	
}

