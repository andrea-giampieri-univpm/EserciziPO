package motori;

public class MotoreDiesel extends Motore implements intMotore {
	
	public MotoreDiesel(int cilindrata, int cilindri) {
		super(cilindrata,cilindri);
		setPotenza();
	}
	
	public boolean isDiesel() {
		return true;
	}
	
	public double getMaxRPM() {
		return (this.potenza*1.41)/this.cilindri;
	}

	private void setPotenza() {
		this.potenza=(this.cilindri*this.cilindrata*2);
	}
}
