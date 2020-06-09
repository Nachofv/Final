import java.util.LinkedList;
import java.util.ListIterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "nacho";
		
		LinkedList<String> ips = new LinkedList<String>();
		ips.add("123.213.234");
		ips.add("192.234.234");
		ips.add("122.1212.21");

		LinkedList<String> mensajes = new LinkedList<String>();
		mensajes.add("12 mensajes");
		mensajes.add("10 mensajes");
		mensajes.add("34 mensajes");
		mensajes.add("234 mensajes");

		ListIterator<String> a = ips.listIterator();
		ListIterator<String> b = mensajes.listIterator();
		
		System.out.println(nombre + " numero total de IPS-> " + ips.size());
		
		while (b.hasNext()) {

			if (a.hasNext()) {

				a.next();
			}
			a.add(b.next());
		}

		System.out.println(ips);

		b = mensajes.listIterator();

		

	}
}
