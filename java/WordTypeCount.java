import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
public class WordTypeCount {

	public static void main(String[] args) {
		Map<String,Integer> mymap = new HashMap<>();
		createMap(mymap);
		displayMap(mymap);
	}
		
		private static void createMap(Map<String,Integer> map)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a String");
			String input = scanner.nextLine();
			String[] tokens = input.split("(?!^)"); // literally used a single regex expression to fix this
			for (String token : tokens)
			{
				String word = token.toLowerCase();
				if (map.containsKey(word))
				{
					int count = map.get(word);
					map.put(word,  count+1);
					
				}
				else
				{
					map.put(word, 1);
				}
			}
		}

	private static void displayMap(Map<String,Integer> map)
	{
		Set<String> keys = map.keySet();
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		System.out.printf("%n Map contains:%nKey\t\tValue%n");
		for (String key : sortedKeys)
		{
			System.out.printf("%-10s%10s%n", key, map.get(key));	
		}
		System.out.printf("%nsize: %d%nisEmpty: %b%n" , map.size(), map.isEmpty());
	}

}
