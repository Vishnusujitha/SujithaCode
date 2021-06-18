package bank.deposit;

import com.sun.jdi.IntegerValue;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a = 20;
		// Integer b=Integer.valueOf(a);
		// System.out.println(a);
		// System.out.println(b);
		// byte by = 10;
		// Byte c=Byte.valueOf(by);
		// System.out.println(by);
		// System.out.println(c);
		// float f = 10.5f;
		// Float fl=Float.valueOf(f);
		// System.out.println(f);
		// System.out.println(fl);
		// Integer d = new Integer(15);
		// int i = d.intValue();
		// System.out.println(d);
		// System.out.println(i);
		// Character charobj = new Character('a');
		// char ch = charobj.charValue();
		// System.out.println(ch);
		// System.out.println(charobj);
		// Float floatobj = new Float(10.5f);
		// float fl = floatobj.floatValue();
		// System.out.println(fl);
		// System.out.println(floatobj);
		// System.out.println(Integer.numberOfLeadingZeros(00001111));
		// String s = "50";
		// int s2 = Integer.parseInt(s);
		// System.out.println(s2+5);
		Integer in = 5;
		String s1 = String.valueOf(in);
		System.out.println(s1+"20");
		System.out.println(Integer.reverse(1234));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s = "Virudhunagar 626001";
	      int count = 0; 
	      for(int i = 0; i<s.length(); i++)
	      {
	        if(s.charAt(i)>='0' && s.charAt(i)<='9')
	        {
	          count = count + s.charAt(i); 
	          //count++; 
	        }
	        //System.out.print(s.charAt(i));
	      }
	        System.out.println(count);	}

}
