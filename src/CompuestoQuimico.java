import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class CompuestoQuimico {

	final String nombre;

	public CompuestoQuimico(String nombre) {

		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CompuestoQuimico [nombre=" + nombre + "]";
	}

	public static void main(String[] args) {

		

		BufferedReader in = null;
		try {
			FileReader entrada = new FileReader("/Users/ignaciofernandezvillar/Documents/CVS/fichero.txt");
			in = new BufferedReader(entrada);
			Set<String> elementos = new TreeSet<>();

			String linea = "";
			while (linea != null) {
				

				linea = in.readLine();

				if (linea != null)
					System.out.print(linea + "\n");

			}

			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se ha encontrado el archivo");
		}

	}

}
