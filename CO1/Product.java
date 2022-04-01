
package product;
import java.util.Scanner;
public class Product {

	    int pcode;
	    String pname;
	    double price;
	    double lowest;
	    void data(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nPen is  the lowest price");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nPencil is  the lowest price");
	        
	    }
	    else{
	        System.out.println("\nBook is  the lowest price");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	        Product obj1 = new Product();
	        Product obj2 = new Product();
	        Product obj3 = new Product();
	        obj1.data(111,"Pen",1060.07);
	        obj2.data(222,"Pencil",328.40);
	        obj3.data(333,"Book",4390.60);
	        System.out.println("Product Information:\n Product Code\tProduct Name\tProduct Price");
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        findLowest(obj1.price,obj2.price,obj3.price);    
	        
	    }
	}
}
