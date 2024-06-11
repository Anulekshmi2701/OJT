interface Moperation{
    int  operate(int a, int b);
}
public class Lambda {
    public static void main(String[] args) {
        Moperation add=(a,b)->a+b;
        Moperation sub=(a,b)->a-b;
        Moperation mul=(a,b)->a*b;
        Moperation div=(a,b)->a/b;
        int res1=add.operate(23, 9);
        int res2=sub.operate(23, 9);
        int res3=mul.operate(23, 9);
        int res4=div.operate(23, 9);
        System.out.println("Addition  :"+res1);
        System.out.println("Subtraction :"+res2);
        System.out.println("Multiplication:"+res3);
        System.out.println("Division r:"+res4);
    }
    
}
