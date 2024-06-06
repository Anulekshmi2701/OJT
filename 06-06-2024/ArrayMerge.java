import java.util.Arrays;
public class ArrayMerge {
public static void main(String[] args) {
    int n[]={1,4,5,6};
    int m[]={2,5,6,1};
    int n1=n.length;
    int m1=m.length;
    int res[]=new int[n1+m1];
    System.arraycopy(n, 0, res, 0, m1);  
    System.arraycopy(m, 0, res, n1, m1);  
    System.out.print(Arrays.toString(res));

    
}
}