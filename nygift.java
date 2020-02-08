import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class nygift{
	String name;
	String to;
	double amount;
	double weight;
	static double totalwg;
	nygift(String name,double price,String to,double weight)
	{
		this.name=name;
		this.amount=amount;
		this.to=to;
		this.weight=weight;
		if(this.to.equals("childern"))
		{
			gift.totalwg=gift.totalwg+this.weight;
		}
	}
	public void dis()
	{
		System.out.println( "Name: "+name);
		System.out.println( "Amount:"+amount );
		System.out.println( "Gifted to: "+to);
		System.out.println( "Weight:"+weight );
	}
}
class chococomparebyprice implements Comparator<choco>{
	public int compare(choco c1,choco c2) {
		return Double.compare(c1.getprice(), c2.getprice());
	}
}

class chococomparebywg implements Comparator<choco>{
	public int compare(choco c1,choco c2) {
		return Double.compare(c1.getweight(), c2.getweight());
	}
}

class choco extends nygift{
	String brand;
	choco(String name,double amount,double weight,String to,String brand)
	{
		super(name,amount,to,weight);
		this.brand=brand;
	}
	
	double getamount()
	{
		return amount;
	}
	double getweight()
	{
		return weight;
	}
	public void dis()
	{
		System.out.println( "Name of the chocolate: "+name);
		System.out.println( "Weight:"+weight );
		System.out.println( "Amount:"+amount );
		System.out.println( "Gifted to: "+to);
		System.out.println( "Brand:"+brand );
	}
	
}

class can extends nygift{
	
	String col;
	can(String name,double amount,double weight,String to,String col)
	{
		super(name,amount,to,weight);
		this.col=col;
	}
	
	double getamount()
	{
		return amount;
	}
	double getweight()
	{
		return weight;
	}
	public void dis()
	{
		System.out.println( "Name of the candy: "+name);
		System.out.println( "Color:"+col );
		System.out.println( "Amount:"+amount );
		System.out.println( "Gifted to: "+to);
		System.out.println( "Weight:"+weight );
	}
	
}
class sweet extends nygift{
	String type;
	sweet(String name,double amount,double weight,String to,String type)
	{
		super(name,amount,to,weight);
		this.type=type;
	}
	double getamount()
	{
		return amount;
	}
	double getweight()
	{
		return weight;
	}
	public void dis()
	{
		System.out.println( "Name of the sweet: "+name);
		System.out.println( "type:"+type );
		System.out.println( "Amount:"+amount );
		System.out.println( "Gifted to: "+to);
		System.out.println( "Weight:"+weight );
	}
}
public class App 
{
    public static void main( String[] args )
    {
       Scanner sc = new Scanner(System.in);
       char mch='q';
       int ch,n;
       String name;
   	   String to;
   	   double amount;
   	   double weight;
   	   String type;
   	   String col;
   	   String brand;
   	   double min,max;
   	   ArrayList<choco> C = new ArrayList<choco>();
   	   ArrayList<can> cd = new ArrayList<can>();
   	   ArrayList<sweet> swt = new ArrayList<sweet>();
   	   int c=0;
       do {
   		System.out.println( "1.Chocolate\n" );
   		System.out.println( "2.Candy\n" );
   		System.out.println( "3.Sweet\n" );
   		System.out.println( "4.Display total weight\n" );
   		System.out.println( "Enter your choice: " );
   		ch=sc.nextInt();
   		int c2;
   		switch(ch) {
   		case 1:
   			System.out.println( "Enter no of chocolate you want to add: " );
		        n=sc.nextInt();
		        sc.nextLine();
		        for(int i=0;i<n;i++)
		        {
		        	System.out.println( "\nEnter detail of the chocolate"+(i+1) );
		        	System.out.println( "\nEnter the name: " );
		        	//sc.nextLine();
		        	name=sc.nextLine();
		        	System.out.println( "\nEnter the amount: " );
		        	amount=sc.nextDouble();
		        	System.out.println( "\nEnter the weight: " );
		        	weight=sc.nextDouble();
		        	System.out.println( "\nChocolate gifted to(childern/adult/teenager): " );
		        	sc.nextLine();
		        	to=sc.nextLine();
		        	System.out.println( "\nEnter the name of the Brand: " );
		        	brand=sc.nextLine();
		        	C.add(new choco(name,amount,weight,to,brand));
		        }
		     System.out.println( "\nObject created" );
		     for(choco co: C)
		    	 {
		    	 co.dis();
		    	 }
		     System.out.println( "\nSorting Menu" );
		     System.out.println( "\n1.By amount" );
		     System.out.println( "\n2.By weight" );
		     System.out.println( "\nEnter your choice:" );
		     c2=sc.nextInt();
		     if(c2==1)
		     {
		    	 System.out.println( "\nSort by amount" );
		    	 Collections.sort(C,new chococomparebyamount());
		     }
		     else if(c2==2)
		     {
		    	 System.out.println( "\nSort by weight" );
		    	 Collections.sort(C,new chococomparebywg());
		     }
		     else
		    	 System.out.println( "\nWrong Choice" );
		     System.out.println( "\nAfter sorting");
		     for(choco co:C)
		    	 co.dis();
		    // System.out.println( "\nDo you want to continue(Y/N): " );
	   			//mch=sc.next().charAt(0);
		     break;
   		case 2:
   			System.out.println( "Enter no of candy you want to add: " );
	        n=sc.nextInt();
	        sc.nextLine();
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println( "\nEnter detail of the candy"+(i+1));
	        	System.out.println( "\nEnter the name: " );
	        	
	        	name=sc.nextLine();
	        	System.out.println( "\nEnter the amount: " );
	        	amount=sc.nextDouble();
	        	System.out.println( "\nEnter the weight: " );
	        	weight=sc.nextDouble();
	        	System.out.println( "\nChocolate gifted to(childern/adult/teenager): " );
	        	sc.nextLine();
	        	to=sc.nextLine();
	        	System.out.println( "\nEnter the name of the color: " );
	        	col=sc.nextLine();
	        	cd.add(new can(name,price,weight,to,col));
	        }
	        System.out.println( "\nObject created" );
	        for(can co: cd)
		    	 co.dis();
		     System.out.println( "\nRange Menu" );
		     System.out.println( "\n1.By amount" );
		     System.out.println( "\n2.By weight" );
		     System.out.println( "\nEnter your choice:" );
		     c2=sc.nextInt();
		     if(c2==1)
		     {
		    	 System.out.println( "\nEnter the min amount" );
		    	 min=sc.nextDouble();
		    	 System.out.println( "\nEnter the max amount" );
		    	 max=sc.nextDouble();
		    	 for(can co:cd)
		    	 {
		    		 if(min <=co.getamount() && max >= co.getamount())
		    		 {
		    			 co.dis();
		    		 }
		    	 }
		     }
		     else if(c2==2)
		     {
		    	 System.out.println( "\nEnter the min weight" );
		    	 min=sc.nextDouble();
		    	 System.out.println( "\nEnter the max weight" );
		    	 max=sc.nextDouble();
		    	 for(can co:cd)
		    	 {
		    		 if(min <=co.getweight() && max >= co.getweight())
		    		 {
		    			 co.dis();
		    		 }
		    	 }
		     }
		     //System.out.println( "\nDo you want to continue(Y/N): " );
	   			//mch=sc.next().charAt(0);
		     break;
   		case 3:
   			System.out.println( "Enter no of sweet you want to add: " );
	        n=sc.nextInt();
	        sc.nextLine();
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println( "\nEnter detail of the sweet"+(i+1) );
	        	System.out.println( "\nEnter the name: " );
	        	name=sc.nextLine();
	        	System.out.println( "\nEnter the amount: " );
	        	amount=sc.nextDouble();
	        	System.out.println( "\nEnter the weight: " );
	        	weight=sc.nextDouble();
	        	System.out.println( "\nChocolate gifted to(childern/adult/teenager): " );
	        	sc.nextLine();
	        	to=sc.nextLine();
	        	System.out.println( "\nEnter the name of the type: " );
	        	type=sc.nextLine();
	        	swt.add(new sweet(name,price,weight,to,type));
	        }
	        System.out.println( "\nObject created" );
	        for(sweet co: swt)
		    	 co.dis();
	        //System.out.println( "\nDo you want to continue(Y/N): " );
   			//mch=sc.next().charAt(0);
		     break;
   		case 4:
   			for(choco co: C)
   				c++;
   			for(can co: cd)
   				c++;
   			for(sweet co: swt)
   				c++;
   			if(c==0)
   				System.out.println( "\nNo object found!!!!!" );
   			else
   				System.out.println( "\nTotal weight: "+gift.totalwg );
   			
   			break;
   		default:
   			System.out.println( "\nWrong choice!!!!!!" );
   				
   		}//end of switch
   		   System.out.println( "\nDo you want to continue(Y/N): " );
			mch=sc.next().charAt(0);   
       }while(mch=='y'|| mch=='Y');
       
       sc.close();
    }
}