import java.util.*;
import java.io.*;

public class Dictionary {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
	      int N=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<N;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         map.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         //Search in map
	        		 Integer number = map.get(s);
	        		 if (number!= null)
	        		 {
	        			 System.out.println(s +"="+number);
	        		 }
	        		 else
	        		 {
	        			 System.out.println("Not found");
	        		 }
	         
	      }
	}

}

/*** Search Logic 
if(phoneBook.containsKey(s)) {
    // Print Result
    System.out.println(s + "=" + phoneBook.get(s));
} else {
    // Default
    System.out.println("Not found");
}***/