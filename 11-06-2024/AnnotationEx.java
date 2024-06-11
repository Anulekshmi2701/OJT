class Parent{
    void Display(){
        System.out.println("Parent class");
    }
}
class child extends Parent{
    @Override
    void Display(){
        System.out.println("Child Class");
    }
}
public class AnnotationEx {
    public static void main(String[] args) {
        Parent p=new child();
        p.Display();
        
    }
    
}
