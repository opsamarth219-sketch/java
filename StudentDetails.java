import java.util.Scanner;
class Student{
    String USN;
    String Name;
    String Branch;
    String Phone;

Student(String USN,String Name, String Branch ,String Phone)
{
    this.USN =USN;
    this.Name = Name;
    this.Branch = Branch;
    this.Phone = Phone;

}

void display(){
    System.out.printf("%-15s %-20s %-15s %15s %n",USN,Name,Branch,Phone);
}
}



public class StudentDetails{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students: ");
        int N =  sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[N];
    for(int i =0;i<N;i++)
    {
        System.out.println(" \nEnter Details of Student " +(i+1)+"\n"+"Enter USN: ");
        String USN = sc.nextLine();
        System.out.print("Enter Name: ");
        String Name  = sc.nextLine();

        System.out.print("Enter Branch: ");
        String Branch = sc.nextLine();
        
        System.out.print("Enter phone");
        String Phone = sc.nextLine();
        
        students[i] = new Student(USN ,Name,Branch,Phone);
        System.out.println("\n======Students Details===");
        System.out.printf("%-15s %-20s %-15s %-15s%n",
                "USN", "Name", "Branch", "Phone");
    }
        System.out.println("=======================================================================================");
        for (int i = 0;i <N;i++)
        {
            students[i].display();

        }       
        sc.close();



    


    }
}
