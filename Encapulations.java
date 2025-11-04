
package Encapulation;
import java.util.Scanner;
public class EncapulationDemo2 {
	private String productName;
	private String productBrand;
	private String productColor;
	private double price;
	
	
	public  String getProductName()
	{
		return productName;	
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	
	public String getProductBrand()
	{
		return productBrand;
	}
	public void setProductBrand(String productBrand)
	{
		this.productBrand= productBrand;
	}
	
	public String getProductColor()
	{
		return productColor;
	}
	public void setProductColor(String productColor)
	{
		this.productColor= productColor;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		if(price > 10000)
		{
			this.price = price;
			System.out.println("the product 10% discount");
			
		}
		else {
			System.out.println("the product currenlty available");
		}
	}
	
	public void display ()
	{
	  System.out.println("ProductName : " + productName);
	  System.out.println("ProductBrand :" + productBrand);
	  System.out.println("ProductColor :" + productColor);
	  System.out.println("Price : " + price);
	  
	}

	public class PruductDemo{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			EncapulationDemo2 demo = new EncapulationDemo2();
	        int  choice ;
	        do {
	    		System.out.println("Mobile sale management : ");
				System.out.println("Add products :");
				System.out.println("View Products :");
				System.out.println("exit :");
				
			  choice =scan. nextInt();
		
			switch(choice) {
			case 1:
				
				System.out.println("Enter a productsName");
				demo.setProductName(scan.nextLine());
				scan.nextLine();
				System.out.println("Enter a productsBrand");
				demo.setProductBrand(scan.nextLine());
				
				System.out.println("Enter a productcolor");
				demo.setProductColor(scan.nextLine());
				
				System.out.println("Enter a price");
				demo.setPrice(scan.nextDouble());
				
				break;
				
			case 2:
				System.out.println("view details");
			    demo.display();
			    break;
			    
			case 3:
				System.out.println("Exit the file Thankyou");
				break;
				
				default:
					System.out.println("not found data");
			}
	       }
	        while (choice <= 3);

		}
	}
}
	
				
				
				
				
		


