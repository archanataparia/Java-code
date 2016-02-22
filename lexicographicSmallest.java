import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lexicographicSmallest {

	/*public static String shuffle(String text)
	{
	    char[] characters = text.toCharArray();
	    for (int i = 0; i < characters.length; i++) {
	        int randomIndex = (int)(Math.random() * characters.length);
	        char temp = characters[i];
	        characters[i] = characters[randomIndex];
	        characters[randomIndex] = temp;
	    }
	    return new String(characters);
	}
	public  void shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }*/
	
	public  static void  shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }
	
	
    public static void main(String[] args) {
   
    	lexicographicSmallest ls=new lexicographicSmallest();
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
    	StringBuilder sOriginal=new StringBuilder(s);
    	//StringBuilder sShuffled=new StringBuilder();
    	/*while(sOriginal.length() != 0){
    	    //int index = Math.random().nextInt(sOriginal.length());
    	    int index = Math.random(
    	    char c = sOriginal.charAt(index);
    	    sShuffled.append(c);
    	    sOriginal.deleteCharAt(index);
    	}*/
    	//System.out.println(sShuffled.toString());
    	shuffle(s);
    	System.out.println(sOriginal.reverse());
    	
    }
}
