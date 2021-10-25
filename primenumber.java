import java.util.*;
public class prime_num {
	static String find_prime(int n)
	{
		int div_prime=n/2,i;
		if(n<=2)
		{
			return("It is a prime number");
		}
		for(i=2;i<=div_prime;i++)
		{
			if(n%i==0)
			{
				return("It is not a prime  number");
			}
		}
		return("It is a prime number");
	}

	public static void main(String[] args) {
		System.out.print("Enter the number : "+" ");
		Scanner sc=new Scanner(System.in);
		int prime=sc.nextInt();
		System.out.println(find_prime(prime));
				
	}

}