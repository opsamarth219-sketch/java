import java.util.Scanner;
public class pgm1{
    public static void main(String []args)
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix: ");
        int n =sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
         
         System.out.println("Enter the elements for the matrix A");
         for(int i = 0;i < n;i++)
         {
            for(int j = 0;j <n;j++)
            {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
         }
         System.out.println("Enter the elements for the matrix B");
         for(int i = 0;i < n;i++)
         {
            for(int j = 0;j <n;j++)
            {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
         }
         System.out.println("The elements for matix A");
         for(int i = 0;i < n;i++)
         {
            for(int j = 0;j <n;j++)
            {
                System.out.println(a[i][j] +" ");

            }
            System.out.println();
         }
         for(int i = 0;i < n;i++)
         {
            for(int j = 0;j <n;j++)
            {
                System.out.print(b[i][j] +" ");

            }
            System.out.println();
         }

    System.out.println("The sum of the two matrices is ");
         for(int i = 0;i < n;i++)
         {
            for(int j = 0;j <n;j++)
            {
                c[i][j] = a[i][j] + b[i][j]; 
                System.out.println(c[i][j]+" ");
            }
            System.out.println();

         }

        
        
    sc.close();
    }
    
}
