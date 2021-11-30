package motori;

public class MotoreBenzina extends Motore implements intMotore {

	public MotoreBenzina(int cilindrata, int cilindri) {
		super(cilindrata,cilindri);
		setPotenza();
	}
	
	public double getMaxRPM() {
		return (this.potenza*3.14)/this.cilindri;
	}

	private void setPotenza() {
		this.potenza=(this.cilindri*this.cilindrata);
	}
}
