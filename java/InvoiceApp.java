// james zachary sherman invoice application main
package invoice.demo.main;
import invoice.demo.application.*;
import java.util.Scanner;
public class InvoiceApp
{
	private static Scanner input;
	
	public static void main(String[] args)
	{
		String NewPartnumber;
		String NewDescription;
		int NewQuantity = 0;
		double newPrice = 0.0;
		
		System.out.println("Please input your Partnumber, Description, Quantity, and Price in that order.\n"
				+ "Orders not in this format or positive numerics will be diregarded and you will be publicly ridiculed.\n");
		input = new Scanner (System.in);
		System.out.println("Input part Number: \n");
		NewPartnumber = input.nextLine();
		System.out.println("Input Description: \n");
		NewDescription = input.nextLine();
		System.out.println("Input part Quantity: \n");
	    NewQuantity = input.nextInt();
	    System.out.println("Input part Price: \n");
	    newPrice = input.nextDouble();
	    // calls for all quantity inputs
	    
	    Invoice NewInvoice = new Invoice(NewPartnumber,NewDescription,NewQuantity,newPrice);
	    System.out.println("Part Number: " + NewInvoice.getPartNumber() + "\n");
	    System.out.println("Part Description: " + NewInvoice.getDescription() + "\n");
	    System.out.println("Part Quantity: " + NewInvoice.getquantity() + "\n");
	    System.out.println("Part Price: " + NewInvoice.getprice() + "\n");
	    System.out.printf("%s:\n %s \n Balance is: $%.2f%n",NewInvoice.getPartNumber(),NewInvoice.getDescription(),NewInvoice.allTotal());
	   
// displays outwards of description part ID and total
	}

}
