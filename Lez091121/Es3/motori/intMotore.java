package motori;

public interface intMotore {
	public int getPotenza();
	public int getCilindrata();
	public double getMaxRPM();
	
	default boolean isDiesel() {
		return false;
	}
}
