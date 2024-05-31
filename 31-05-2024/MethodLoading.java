public class MethodLoading {
public void add(int a){
    System.out.println(4+a);
}
public void add(int a ,int b){
    System.out.println(a+b);
}
public static void main(String[] args) {
    MethodLoading ml = new MethodLoading();
    ml.add(10);
    ml.add(34,4);
   
}
}

    

