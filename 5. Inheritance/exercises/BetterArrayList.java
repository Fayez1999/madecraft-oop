package exercises;

import java.util.ArrayList;
import java.util.List;

public class BetterArrayList<E> extends ArrayList<E>{
	
	public E pop() {
		E last = (E) this.get(this.size() - 1);
		return last;
	}
	
	public void printList() {
		
		for(E element : this) {
			System.out.println(element);
		}
		
	}
	
	public void insert(E name, int index) {
		this.add(index, name);
	}
	
	

}
