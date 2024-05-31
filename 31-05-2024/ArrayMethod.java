import java.util.Arrays;
public class ArrayMethod {
    public static void main(String[] args) {
        int [] num={8,6,2,4,1,3,5};
        for(int i:num){
            System.out.println("Array element="+i);
        } 

        System.out.println("Length of an array:" +num.length);
        Arrays.sort(num);
        for(int i:num){
            System.out.println("Sorted array element="+i);
        }
       
    System.out.println("Array after sorting:" +Arrays.toString(num));
    int[] copy=Arrays.copyOf(num,num.length);
    System.out.println("copy of an array" +Arrays.toString(copy));
    boolean isequal=Arrays.equals(num, copy);
    System.err.println(isequal);
    int index=Arrays.binarySearch(copy,3);
    System.out.println(index);
    }
    
}

