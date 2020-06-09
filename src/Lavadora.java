import java.io.Serializable;

public class Lavadora extends Electrodomestico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private double carga;

	public Lavadora(double precio, String color, String consumo, double peso, double precio_final) {
		super(precio, color, consumo, peso, precio_final);

		this.carga = 5;

	}

	public double getCarga() {

		if (carga > 8) {
			precio_final = precio * 0.8;
		}
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [precio=" + precio + ", precio_final=" + precio_final + "]" + super.toString();
	}

}
