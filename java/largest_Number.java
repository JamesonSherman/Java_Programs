import java.util.Scanner;
public class largest_Number
{
	public static Scanner value;
	
	public static void main(String[] args) 
	{
		  System.out.println("This is exercise 2.24");
			value = new Scanner (System.in);
			int num1;
			int num2;
			int num3;
			int num4;
			int num5;
			int num6;
			int num7;
			int num8;
			int num9;
			int num10;
			int highest = 0;
			int counter = 0;
			int val;
			
			System.out.println("Please input your five numbers forsorting");
			 System.out.println("Number 1 : ");
		 num1 = value.nextInt();
		 val = num1;
		 System.out.println(++counter + " Value Validation: " + val);
		 System.out.println("\n");
		 /*---------------------------------*/
		 System.out.println("Number 2 : ");
		 num2 =  value.nextInt();
		 val = num2;
		 System.out.println (++counter + " Value Validation: " + val);
		 /*---------------------------------*/
		 System.out.println("\n");
			System.out.println("Number 3 : ");
		 num3 =  value.nextInt();
		 val = num3;
		 System.out.println( ++counter + " Value Validation: " + val);
		 /*--------------------------------*/
		 System.out.println("\n");
			System.out.println("Number 4 : ");
		 num4 =  value.nextInt();
		 val = num4;
		 System.out.println(++counter + " Value Validation: " + val);
		 /*-------------------------------*/
		 System.out.println("\n");
			System.out.println("Number 5 : ");
		 num5 =  value.nextInt();
		 val = num5;
		 System.out.println( ++counter + " Value Validation: " + val);
		 /*-------------------------------*/
		 System.out.println("\n");
		 System.out.println("Number 6 : ");
		 num6 =  value.nextInt();
		 val = num6;
		 System.out.println( ++counter + " Value Validation: " + val);
		 /*-------------------------------*/
		 System.out.println("\n");
		 System.out.println("Number 7 : ");
		 num7 =  value.nextInt();
		 val = num7;
		 System.out.println( ++counter + " Value Validation: " + val);
		 /*-------------------------------*/
		 System.out.println("\n");
		 System.out.println("Number 8 : ");
		 num8 =  value.nextInt();
		 val = num8;
		 System.out.println(++counter + " Value Validation: " + val);
		 /*-------------------------------*/
		 System.out.println("\n");
		 System.out.println("Number 9 : ");
		 num9 =  value.nextInt();
		 val = num9;
		 System.out.println( ++counter + " Value Validation: " + val);
		 /*-------------------------------*/
		 System.out.println("\n");
		 System.out.println("Number 10 : ");
		 num10 =  value.nextInt();
		 val = num10;
		 System.out.println( ++counter + " Value Validation: " + val);
		 System.out.println("\n");
		 
		 
		 
		 if ( counter == 10)
		 {
		 System.out.println("Numbers Accounted for");
		 }
		 else
		 {
	     System.out.println("Numbers error has Occured. Please Try Again");
		 }
		 
		 
		 if ( num1 >= num2 && num1 >= num3 &&  num1 >= num4 && num1 >= num5 && num1 >= num6 && num1 >= num7 && num1 >= num8 && num1 >= num9 && num1 >=                        		 num10)
		 {
			 highest = num1;
		 }
		 else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5 && num2 >= num6 && num2 >= num7 && num2 >= num8 && num2 >= num9 && num2 >= num10)
		 {
			 highest = num2;
		 }
		 else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6 && num3 > num7 && num3 > num8 && num3 > num9 && num3  >num10)
		 {
			 highest = num3;
		 }
		 else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6 && num4 > num7 && num4 > num8 && num4 > num9 && num4  			 		 >num10)
		 {
			highest = num4; 
		 }
		 else if (num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4 && num5 >= num6 && num5 >= num7 && num5 >= num8 && num5 >= num9 && num5  >= num10)
		 {
			highest = num5;
		 }
		 else if (num6 > num1 && num6 > num2 && num6 > num3 && num6 > num4 && num6 > num5 && num6 > num7 && num6 > num8 && num6 > num9 && num6  >num10)
		 {
		 highest = num6;
		 }
		 else if (num7 > num1 && num7 > num2 && num7 > num3 && num7 > num4 && num7 > num5 && num7 > num6 && num7 > num8 && num7 > num9 && num7  > num10)
		 {
			 highest = num7;
		 }
		 else if ( num8 > num1 && num8 > num2 && num8 > num3 && num8 > num4 && num8 > num5 && num8 > num6 && num8 > num7 && num8 > num9 && num8 > num10 )
		 {
		 highest = num8;		
		 }
		 else if (num9 > num1 && num9 > num2 && num9 > num3 && num9 > num4 && num9 > num5 && num9 > num6 && num9 > num7 && num9 > num8 && num9 > num10)
		 {
			 highest = num9;
		 }
		 else if ( num10 > num1 && num10 > num2 && num10 > num3 && num10 > num4 && num10 > num5 && num10 > num6 && num10 > num7 && num10 > num8 && num10 > num9)
		 {
		  highest = num10;
		 }
		 System.out.println("largest number is: " + highest);
	}
}
	