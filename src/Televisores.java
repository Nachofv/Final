import java.io.Serializable;

public class Televisores extends Electrodomestico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private double pulgadas;
	private String sintonizador;

	public Televisores(double precio, String color, String consumo, double peso, double precio_final) {
		super(precio, color, consumo, peso, precio_final);

		this.pulgadas = 20;
		this.sintonizador = " DVB-T";
	}

	@Override
	public String toString() {
		return "Televisores [pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + ", precio=" + precio
				+ ", precio_final=" + precio_final + "]";
	}

}
