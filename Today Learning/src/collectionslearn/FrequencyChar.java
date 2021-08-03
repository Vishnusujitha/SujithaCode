package collectionslearn;

import java.util.HashMap;
import java.util.Set;

public class FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="colon info tech";
         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
         char[] ch=name.toCharArray();
         for(Character c:ch) {
        	 if(!hm.containsKey(c))
        	  {
        	    hm.put(c, 1); 
        	  }
        	  else
        	  {
        	    int value = hm.get(c); 
        	    hm.put(c, value+1); 
        	  }
        	}
         Set<Character> s=hm.keySet();
         for(Character c:s) {
        	 if(hm.get(c)>=1) 
        		System.out.println(c+" = "+hm.get(c));
         }

}
}