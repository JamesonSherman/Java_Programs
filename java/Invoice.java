package invoice.demo.application;

public class Invoice 
{

		private String PartNumber;
		private String Description;
		private int quantity;
		private double price ;
		private double total;
		
		
		
		
		public Invoice( String PartNumber, String Description, int quantity,double price)

		{
			this.PartNumber = PartNumber;
			this.Description = Description;
			if (quantity > 0)
			{
			this.quantity = quantity;
			}
			if (price > 0.0)
			{
			this.price = price;
			}
			
		}
		
		
		
		public void setNumber(String PartNumber)
		{
		this.PartNumber = PartNumber;
		}
		
		public void setDescription (String Description)
		{
			this.Description = Description;
		}
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		public void setPrice(double price)
		{
			this.price = price;	
		}
		
		public void setTotal (double total)
		{
			this.total = total;
		}
		
		
		// initalizes numbers from input
		
		
		public String getPartNumber()
		{
			return PartNumber;
			
		}
		
		public String getDescription()
		{
			return Description;
		}
		
		public int getquantity()
		{
		   return quantity;
		}
		
		public double getprice()
		{
		  return price;
		}
		
		public double allTotal ()
		{
			total = quantity * price;
			if (total <= 0.0)
			{
			total = 0.0;
			System.out.println("totals do not have correct input zeroing order");
			return total;
			}
			else
				return total;
		
		}
		
		
	}
		

