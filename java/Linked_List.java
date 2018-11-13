import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class Linked_List {

	public static void main(String[] args) 
	{
	String[] list1 = { "a", "b" , "c" , "d" , "e" , "f", "g", "h", "i" };
	List<String> linklistey = new LinkedList<>();
	
	for (String holdermcholderson : list1)
	{
		linklistey.add(holdermcholderson);
		
	}

	printList(linklistey);
	List<String> linklistey2 = new LinkedList<>();
	for (String holdermcholderson : list1)
	{
		linklistey2.add(holdermcholderson);
		
	}

	printReversedList(linklistey2);
	
	}
	private static void printList(List<String> list)
	{
		System.out.printf("%nlist:%n");
		for (String character : list)
		{
			System.out.printf("%s ", character);
		}
	}
	private static void printReversedList(List<String> list)
	{
		ListIterator<String> iterator = list.listIterator(list.size());
		System.out.printf("%nReversed List: %n");
		while(iterator.hasPrevious())
		{
			System.out.printf("%s ", iterator.previous());
		}
	}
}