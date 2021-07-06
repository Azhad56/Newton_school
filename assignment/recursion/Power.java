package assignment.recursion;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Power {
	public static double pow(double x,double n)
	{
		if (n==0)
		{
			return 1;
		}
		else if (n%2==0)
		{
			return pow(x,n/2)*pow(x,n/2);
		}
		else 
		{
			return x*pow(x,n/2)*pow(x,n/2);
		}
	}
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for (int t=0;t<T;t++)
	{
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(pow(x,n));
	}
	}
}