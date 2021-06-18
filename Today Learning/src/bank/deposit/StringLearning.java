package bank.deposit;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ramkumar"; 
		  System.out.println(name.hashCode());
		  System.out.println(name);
		  
		  name = "Nagalakshmi"; 
		  System.out.println(name.hashCode());
		  
		    String state1 = "Tamil Nadu"; 
		    System.out.println(state1.hashCode());
		    String state2 = "Tamil Nadu"; 
		    System.out.println(state2.hashCode());
		    String state3 = "Tamil Nadu"; 
		    System.out.println(state3.hashCode());
		    String state4 = "Tamil Nadu"; 
		    System.out.println(state4.hashCode());
		    String state5 = "Tamil Nadu";
		    System.out.println(state5.hashCode());
		    state1 = "Karnataka"; 
		    System.out.println(state1.hashCode());
		    String state = "Tamil Nadu"; 
		      for(int i=0;i<=9;i++)
		    {
		    System.out.println(state.charAt(i)); 
		    }
		    System.out.println(state.contains("Tamil")); 
		    System.out.println(state.contains("India"));
		    System.out.println(state.contentEquals("Tamil")); 
		    System.out.println(state.contentEquals("Tamil Nadu"));
		    System.out.println(state.contentEquals("tamil nadu")); 
		    System.out.println(state.compareTo("Tamil Nadu")); 
		    System.out.println(state.compareTo("Kerala"));
		    System.out.println(state.compareTo("UttarPradesh")); 
		    System.out.println(state.compareTo("TAMIL NADU")); 		    
		    System.out.println(state.compareToIgnoreCase("TAMIL NADU")); 
		    // Tamil Nadu
		    // 0123456789
		   System.out.println(state.indexOf('a')); 
		   System.out.println(state.lastIndexOf('a'));
		   System.out.println(state.indexOf("Nadu")); 
		
		    System.out.println(state.length());
		    System.out.println(state.toUpperCase());
		   

	}

}
