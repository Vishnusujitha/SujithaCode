package collections;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(20);
		System.out.println(l);
		System.out.println(l.subList(2, 4));
		ArrayList l2=new ArrayList();
		l2.add(200);
		l2.add('s');
		l2.add(3.4f);
		l2.add("suji");
		l2.add(true);
		l2.addAll(l);
		System.out.println(l2);
    	System.out.println(l2.retainAll(l));
    	System.out.println(l2);
	}
}
