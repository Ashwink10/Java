public class two_d_array {
	static void add_matrix(int a[][],int b[][])
	{
		int i,j;
		System.out.println("MATRIX ADDITION");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	static void product_matrix(int a[][],int b[][])
	{
		int i,j;
		System.out.println("\nMATRIX MULPLICATION");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]*b[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		int a[][]= {{1,2,4},{2,4,6},{3,2,1}};
		int b[][]= {{1,3,4},{2,3,4},{1,2,4}};
		add_matrix(a,b);
        product_matrix(a,b);
	}

}