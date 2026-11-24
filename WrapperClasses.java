
import java.util.Scanner;
public class WrapperClasses {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for Subject 1(as string): ");
        String sub1Str = sc.next();
         System.out.println("Enter the marks for Subject 2(as string): ");
         String sub2Str = sc.next();
          System.out.println("Enter the marks for Subject 3(as string): ");
           String sub3Str = sc.next();


           Integer  mark1 = Integer.valueOf(sub1Str);
           Integer  mark2 = Integer.valueOf(sub2Str);
           Integer  mark3 = Integer.valueOf(sub3Str);

           Integer total = mark1+mark2+mark3;
           Double average = total/3.0;

           System.out.println("\n--- Students Marks Summary---");
           System.out.println("Subject 1 marks:"+ mark1);
           System.out.println("Subject 2 marks:"+ mark2);
           System.out.println("Subject 3 marks:"+ mark3);
           System.out.println("Total marks  :"+total);
           System.out.println("Average marks :"+ average);

           sc.close();





    }
    
}
