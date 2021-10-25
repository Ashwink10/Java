class Employee
{
	public void details(String[][] s)
	{
		System.out.println("Name"+"            "+"Year of joining"+"     "+"Address");
		int i,j;
		for(i=0;i<s.length;i++)
		{
			for(j=0;j<s[0].length;j++)
			{
				System.out.print(s[i][j]+"          ");
			}
			System.out.println();
		}
		
	}
}

public class employee_method {

	public static void main(String[] args) {
		String[][] stu= {{"Robert \nWallsStreet","1994","64C-"},{"Sam \nWallsStreet","2000","68D-"}, {"John \nWallsStreet","1999","26B-"}};
		
		Employee e = new Employee();
		e.details(stu);

	}

}