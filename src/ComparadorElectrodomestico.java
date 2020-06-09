import java.util.Comparator;

public class ComparadorElectrodomestico implements Comparator<Electrodomestico>{

	@Override
	public int compare(Electrodomestico o1, Electrodomestico o2) {
		// TODO Auto-generated method stub
		
		double a=o1.getPrecio();
		double b=o2.getPrecio();
		if(a < b)
			return 1;
		else if(a > b ) {
			return -1;
		}else
		return o1.compareTo(o2);
	}
	

}
