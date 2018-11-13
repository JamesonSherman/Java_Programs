import java.util.*;
import java.util.Scanner;


public class partone {
		
		public static void main(String[] args) 
	{
			 Scanner s = new Scanner(System.in);
			 	String NameCheck;
			    String[] array = new String[10];
			    System.out.println("Please enter 10 names to add to treeset");

			    for (int i = 0; i < array.length; i++) {
			        array[i] = s.nextLine();
			    }

			    Set<String> set = new TreeSet<>(Arrays.asList(array));
			    
			    System.out.println(set);
			    
			    System.out.println("Input a name to check against your set");
			    NameCheck = s.nextLine();
			    if(set.contains(NameCheck))
			    {
			    	System.out.printf("Set Contains: " + NameCheck );
			    }
			    else
			    {
			    	System.out.printf("Set does not contain " + NameCheck);
			    }
			
			
			
	}
	}
