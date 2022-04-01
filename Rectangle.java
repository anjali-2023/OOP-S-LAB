package rectangle;
public class Rectangle {
    int length,breadth;
Rectangle(int l,int b)
{
length=l;
breadth=b;
}
public void area()
{
    int area=length*breadth;
    System.out.println("area: "+area);
}
public void perimeter()
{
    int perimeter=2*(length+breadth);
    System.out.println("perimeter: "+perimeter);
}
    public static void main(String[] args)
    {
        Rectangle r1= new Rectangle(3,5);
        r1.perimeter();
        r1.area();
      Rectangle r2=new Rectangle(7,5);
       r2.perimeter();
       r2.area();
    }
    
}