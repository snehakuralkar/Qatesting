
public class Sample1
{
	static int a = 100;
	static int b;
	int c ;
	char h;
	
   public static void main(String[] args) 
   {
	   Sample1.a = 200;
	   
	   System.out.println("The value of a is " + Sample1. a );
	   System.out.println("The value of b is " + Sample1. b );
	   Sample1 S1 = new Sample1();
	   Sample1 S2 = new Sample1();
	   System.out.println("The value of h is " + S1.h);
	   System.out.println("The value of c is " + S2.c);
	   
	
    }
 


}
