import java.util.Scanner;
abstract class Publication	        	//class publication
{
    String title;	                	//instance variable
    int  price,copies;
    abstract void salecopy();
    abstract void setprice();
}

class Book extends Publication                 //Child class Book inherit the publication class.
{
    String author;
   
    void salecopy()
    { 
        System.out.println("****----*************************----********");
        System.out.println("Book name:"+title);
        System.out.println("Author name:"+author);
        System.out.println("price per Book:"+price);
        System.out.println("Copies ordered:"+copies);
        System.out.println("Total sales:"+copies*price);
    }
     
    
    void orderCopies()
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter copies : ");
     copies=sc.nextInt();
     
    }
    
    void setprice()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title of Book : ");
        title=sc.next();
        
        System.out.print("Enter name of author : ");
        author=sc.next();
        
        System.out.print("Enter Price of the Book : ");
        price=sc.nextInt();
        
        
    }
 
}

class Magazine extends Publication
{
    String currIssue;
    
    void salecopy()
    {   
        System.out.println("****----*************************----********");
        System.out.println("Magzing name: "+title);
        System.out.println("Price per Magzine: "+price);
        System.out.println("Copies ordered: "+copies);
        System.out.println("Total Sales: "+copies*price);
    }
    
    void orderQty()
    {
      System.out.println("Enter the quantity of Magzine: ");
      Scanner sc = new Scanner(System.in);
      copies=sc.nextInt();
      
    }
    
    void currentIssue()
    {
         System.out.println("Current issue of Magzine is: "+currIssue);
    }
    
    void recieveIssue()
    {
        System.out.println("You will recieve "+currIssue+"Magzine soon!");
    }
    
    void setprice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title of Magzine: ");
        title=sc.next();
        
        System.out.print("Enter the Issue: ");
        currIssue=sc.next();
        
        System.out.print("Enter Price of the Magzine: ");
        price=sc.nextInt();
        
    }
  
}

public class Polymorphism
{

	public static void main(String[] args)
	{
	                                        	
		Book b = new Book();	         	//Creating object of Book class.
	    b.setprice();
	    b.orderCopies();
	    b.salecopy();
	                                        
	    Magazine m = new Magazine();   	       //Creating object of Magazine class
	    m.setprice();
	    m.orderQty();
	    m.recieveIssue();
	    m.salecopy();

	}

}

