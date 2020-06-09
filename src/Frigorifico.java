import java.io.Serializable;

public class Frigorifico extends Electrodomestico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean NoFrost;

	public Frigorifico(double precio, String color, String consumo, double peso, double precio_final) {
		super(precio, color, consumo, peso, precio_final);
		this.setNoFrost(false);

	}

	@Override
	public String toString() {
		return "Frigorifico [precio=" + precio + ", precio_final=" + precio_final + ", NoFrost=" + isNoFrost()
				+ super.toString() + "]";
	}

	public boolean isNoFrost() {
		return NoFrost;
	}

	public void setNoFrost(boolean noFrost) {
		NoFrost = noFrost;
	}

}
