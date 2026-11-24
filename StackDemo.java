public class StackDemo {
    	public static void main(String[] args) {
		//Getting the order N of the matrix from command line argument
		int order=Integer.parseInt(args[0]);
			
		int a[ ][ ]=new int[order] [order];
		int b[ ][ ]=new int[order][order];
		int c[ ][ ]=new int[order][order];
			
		Scanner sc = new Scanner(System.in);
		//Reading in the elements into matrix a
		System.out.println("Enter the elements for matrix a");
		for(int i=0;i<order;i++)
		{
			for(int j=0;j<order;j++)
			{
				a[i][j]=sc.nextInt();	
				}	
			}
			//Reading in the elements into matrix b
			System.out.println("Enter the elements for matrix b");
			for(int i=0;i<order;i++)
			{
			for(int j=0;j<order;j++)
			{
		b[i][j]=sc.nextInt();
					
		}
				
	}
	System.out.println("The elements for matrix a");
	for(int i=0;i<order;i++)
	{
	for(int j=0;j<order;j++)
	{				
	System.out.print(a[i][j]+"");
	}
	System.out.println();
	}
	System.out.println("The elements for matrix b");
	for(int i=0;i<order;i++)
	{
	for(int j=0;j<order;j++)
	{				
	System.out.print(b[i][j]+"");
	}
	System.out.println();
	}
	//Finding the sum
	System.out.println("The sum of two matrices is");
	for(int i=0;i<order;i++)
	{
	for(int j=0;j<order;j++)
{
	c[i][j]=a[i][j]+b[i][j];
	
	System.out.print(c[i][j]+"");
		}
		System.out.println();
		}
     }
     