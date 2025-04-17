package Collection;

import java.util.Comparator;

class sortByPrice<T> implements Comparator<Mobile> {
	
	public int compare(Mobile m1,Mobile m2) {
		return Double.compare(m1.getPrice(),m2.getPrice());
	}

}
