package eclipse;

public class p1 {
	public static void main(String[] args) {
		int a=10;
		int b= 9;
		int ans=a/b;
		System.out.println(ans);
		System.out.println("Hello!!!");
		
		addition(10,20);
		multiplication(5,10);
		int i;
	    division(10,2);
		
		for (int o=1 ; o<=10 ; o++)
		{
			System.out.println("Hello");
		}
	}
	
	static void addition (int a,int b)
	{
		int ans=a+b;
		System.out.println(ans);
	}
	
	static void multiplication (int x,int y)
	{
		int ans=x*y;
		System.out.println(ans);
	}
	
	static void division (int p,int q)
	{
		int ans=p/q;
		System.out.println(ans);
	}

}
