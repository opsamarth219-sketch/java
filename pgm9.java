import java.util.Scanner;
enum Department{
    CSE,ISE,ECE,MECH,AIML
}
public class pgm9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department(CSE/ISE/ECE/MECH):");
        String input = sc.next().toUpperCase();
        try{
            Department dept = Department.valueOf(input);
            System.out.println("Selected Department:"+dept);
            switch(dept)
            {
                case CSE:
                    System.out.println("Descripton : Computer Science and Engineering");
                    break;
                case ISE:
                    System.out.println("Description Information science and engineering");
                    break;
                case ECE:
                    System.out.println("Description: Electronics and Communication");
                    break;
                case MECH:
                    System.out.println("Description :Mechanical Engineering");
                    break;
                case AIML:
                    System.out.println("Desc");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+input+"is not valid department in the enumeration.");
    
        }
        finally{
            sc.close();
        }
        

    }
    
}
