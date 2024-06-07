class Employee{
    public void name(){
     System.out.println("Name");   
    }
}
class Manager extends Employee{
    public void id(){
       System.out.println("id"); 
    }
}
class Developer extends Manager{
    public void phone(){
        System.out.println("phone number");
    }
}
public class Main {
    public static void main(String[] args) {
        Employee em=new Employee();
        Manager ma=new Manager();
        Developer de=new Developer();
        em.name();
        ma.id();
        de.phone();
       
    }
    
}
