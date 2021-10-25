import java.util.Scanner;
public class JavaFibo {
	static int[] Fibonacci(int n)
	{
		int i;
		int f[]=new int[n+2];
		f[0]=0;
		f[1]=1;
		for(i=2;i<=n;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		return(f);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("n : ");
		int n=s.nextInt();
		int[] arr=Fibonacci(n);
		for(int i=0;i<n+1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}