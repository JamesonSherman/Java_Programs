import java.util.Scanner;

public class Drawing_Class {

	private static Scanner choicevalue;
	private static Scanner value;
	public static void main(String[] args) 
	{
		int choice = -1;
		
		System.out.println("Please Select 1 for shapes, 2 for the checker pattern\n" +
		"Press 3 for sorting of numbers highest to lowest. Press 4 for the description of set and get");
		choicevalue = new Scanner (System.in);	
		choice = choicevalue.nextInt();
		
	switch (choice)
	{

	case 1:
	{
		System.out.println("This is project 2.18\n");
	System.out.println("1: **********      ****        *          *                 ");
	System.out.println("2: *        *     *    *      ***        * *                ");
	System.out.println("3: *        *   *        *   *****      *   *               ");
	System.out.println("4: *        *   *        *     *       *     *              ");
	System.out.println("5: *        *   *        *     *      *       *             ");
	System.out.println("6: *        *   *        *     *       *     *              ");
	System.out.println("7: *        *   *        *     *        *   *               ");
	System.out.println("8: *        *     *    *       *         * *                ");
	System.out.println("9: **********      ****        *          *                 ");
	
	}
		
		break;
	case 2:
	{
		
		System.out.println("This is exercsise 2.27\n");
	    int length = 16;
	    int height = 8;

	    for (int a = 0; a <= height; a++) {
	        char open = ' ';
	        char asterik= '*';
	        if (a % 2 == 0) {
	            open = '*';
	            asterik = ' ';
	        }
	        for (int b = 0; b < length; b++) {
	            if (b % 2 == 0) {
	                System.out.print(open);
	            } else {
	                System.out.print(asterik);
	            }
	        }
	        System.out.println("");
	    }
		
	}
	break;
	case 3:
	{
	    System.out.println("This is exercise 2.24");
		value = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int highest = 0;
		int lowest  = 0;
		
		System.out.println("Please input your five numbers forsorting");
		 System.out.println("Number 1 : ");
	 num1 = value.nextInt();
	 System.out.println("\n");
	 System.out.println("Number 2 : ");
	 num2 =  value.nextInt();
	 System.out.println("\n");
		System.out.println("Number 3 : ");
	 num3 =  value.nextInt();
	 System.out.println("\n");
		System.out.println("Number 4 : ");
	 num4 =  value.nextInt();
	 System.out.println("\n");
		System.out.println("Number 5 : ");
	 num5 =  value.nextInt();
	 System.out.println("\n");
	 
	 if ( num1 > num2 && num1 > num3 &&  num1 > num4 && num1 > num5) 
	 {
		 highest = num1;
	 }
	 else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
	 {
		 highest = num2;
	 }
	 else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
	 {
		 highest = num3;
	 }
	 else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
	 {
		highest = num4; 
	 }
	 else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
	 {
		highest = num5;
	 }
	 
	 
	 if ( num1 < num2 && num1 < num3 &&  num1 < num4 && num1 < num5) 
	 {
		 lowest = num1;
	 }
	 else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
	 {
		lowest = num2;
	 }
	 else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
	 {
		 lowest = num3;
	 }
	 else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
	 {
		lowest = num4; 
	 }
	 else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)
	 {
		lowest = num5;
	 }
	 
	 System.out.println("The highest number is: " +highest);
	 System.out.println("The lowest number is: " +lowest);
	  }
	break;
	case 4:
	{
		
		System.out.println("This is the answer to question 3.10\n");
		System.out.println("Set and Get methods are a pattern of data encapsulation.\n"
				+ "Instead of accessing class member variables directly, you define get methods to access these variables,\n"
				+ "and set methods to modify them. By encapsulating them in this manner, you have control over the public interface, \n"
				+ "should you need to change the inner workings of the class in the future.\r\n" + 
				"\r\n" + 
				"For example, for a member variable:\r\n" + 
				"\r\n" + 
				"Integer x;\r\n" + 
				"You might have methods:\r\n" + 
				"\r\n" + 
				"Integer getX(){ return x; }\r\n" + 
				"void setX(Integer x){ this.x = x; }");
		 }
	 }
	}
   }
