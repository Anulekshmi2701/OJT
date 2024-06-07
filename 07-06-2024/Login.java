import java.util.Scanner;

public class Login {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the username:");
    String name=sc.nextLine();
    
    System.out.print("Enter the Password:");
    String pass=sc.nextLine();

    String username="admin@gmail.com";
    String password="admin123";
    
    if(username==name && password==pass){
        System.out.println("Your login is Successfully Completed");
    }
    else{
        System.out.println("your wrong!");
    }
  }  
}
