
public abstract class Electrodomestico implements Comparable<Electrodomestico> {

	enum color {
		blanco, negro, rojo, azul, gris
	};

	protected double precio;
	private String color;
	private String consumo;
	private double peso;
	protected double precio_final;

	public Electrodomestico(double precio, String color, String consumo, double peso, double precio_final) {

		super();

		this.precio = 100;
		this.color = "blanco";
		this.consumo = "B";
		this.peso = peso;
		this.precio_final = precio_final;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(double precio_final) {

		if (consumo == "A") {
			precio_final = precio * 0.30;
		}
		if (consumo == "B") {
			precio_final = precio * 0.25;
		}
		if (consumo == "C" || peso >= 80) {
			precio_final = precio * 0.20;
		}
		if (consumo == "D" || peso >= 50 || peso <= 79) {
			precio_final = precio * 0.15;
		}
		if (consumo == "E" || peso >= 20 || peso <= 49) {
			precio_final = precio * 0.10;
		}
		if (consumo == "F" || peso > 0 || peso < 19) {
			precio_final = precio * 0.5;
		}

		this.precio_final = precio_final;
	}

	public String toString() {

		return precio + " " + color + " " + consumo + " " + peso + " " + precio_final;
	}

	@Override
	public int compareTo(Electrodomestico e) {

		return consumo.compareTo(e.consumo);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((consumo == null) ? 0 : consumo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(precio_final);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electrodomestico other = (Electrodomestico) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (consumo == null) {
			if (other.consumo != null)
				return false;
		} else if (!consumo.equals(other.consumo))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (Double.doubleToLongBits(precio_final) != Double.doubleToLongBits(other.precio_final))
			return false;
		return true;
	}

}
