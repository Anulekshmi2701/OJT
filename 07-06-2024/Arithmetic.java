import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2=sc.nextInt();

        Scanner scanner=new Scanner(System.in);
        
        System.out.println("1.Add,2.Sub,3.Mul,4.Div Choose any number: ");
        int operator=sc.nextInt();
        int result;
        
        switch (operator) {
            case 1:
                result=num1+num2;
                System.out.println(result);
                break;
            case 2:
                result=num1-num2;
                System.out.println(result);
                break;
            case 3:
                result=num1*num2;
                System.out.println(result);
                break;

            case 4:
                result=num1/num2;
                System.out.println(result);
                break;
        
            default:
            System.out.println("Enter the correct number");
                break;
                }
                

    }
    
}
        