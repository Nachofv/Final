
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PruebaElectrodomesticos {

	public static void main(String[] args) {

		ArrayList<Electrodomestico> tipos = new ArrayList<Electrodomestico>();
		tipos.add(new Frigorifico(900, "azul", "D", 30, 50));
		tipos.add(new Lavadora(562, "blanco", "B", 56, 12950));
		tipos.add(new Televisores(7123, "negro", "C", 20, 870));
		Iterator<Electrodomestico> i = tipos.iterator();
		while (i.hasNext()) {
			i.next();
			for (Electrodomestico e : tipos) {
				System.out.println(e);

			}
		}

		Collections.sort(tipos);
		guardaDatos(tipos, "/Users/ignaciofernandezvillar/Documents/DAW/2ºDAW/Programación/examen.txt");
		Collections.sort(tipos, new ComparadorElectrodomestico());
		guardar(tipos, "/Users/ignaciofernandezvillar/Documents/DAW/2ºDAW/Programación/examen1.txt");

	}

	static void guardaDatos(ArrayList<Electrodomestico> tipos, String ruta) {

		ObjectOutputStream nuevo = null;

		try {
			nuevo = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ruta)));
			nuevo.writeObject(tipos);
			nuevo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (nuevo != null)
				try {
					nuevo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	static void guardar(ArrayList<Electrodomestico> tipos, String ruta) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter(ruta));
			Iterator<Electrodomestico> i = tipos.iterator();
			while (i.hasNext())
				out.println(i.next());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				out.close();
		}
	}

}
