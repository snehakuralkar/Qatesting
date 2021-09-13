
public class Swapvalues 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30,d=40;
		System.out.println("The value of a " + a);
		System.out.println("The value of b " + b);
		System.out.println("The value of c " + c);
		System.out.println("The value of d " + d);
		
		a=b;
		b=c;
		c=d;
		d=a;
		System.out.println();
		System.out.println("The value of a " + a);
		System.out.println("The value of b " + b);
		System.out.println("The value of c " + c);
		System.out.println("The value of d " + d);
	}

}
