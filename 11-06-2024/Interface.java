interface shape{
    double calarea();
}
class rectangle implements shape{
    private double length;
    private double width;
    public rectangle(double length,double width){
        this.length=length;
        this.width=width;

    }
    public double calarea(){
        return length*width;
    }
    public double peri(){
        return (length+width)*2;
    }
}

public class Interface {
public static void main(String[] args) {
    rectangle rec=new rectangle(10,5);
    System.out.println("Area of the rectangle="+ rec.calarea());
    System.out.println("Permeter="+rec.peri());
}
    
}