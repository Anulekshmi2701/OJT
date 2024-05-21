import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Employee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name :");
        String name = sc.nextLine();
        System.out.println("Enter employee Salary :");
        String salary = sc.nextLine();

        System.out.println("Enter joining Date");
        LocalDate joiningDate = LocalDate.parse(sc.nextLine());
        LocalDate currentDate = LocalDate.now();
        Period experience = Period.between(joiningDate, currentDate);
        System.out.println("Name : "+name );
        System.out.println("Expeience : " + experience.getYears() +"Years");
        System.out.println("Salary : "+salary );
    }
}