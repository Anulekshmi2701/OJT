import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Orange");
        str.add("Mango");
        str.add("Pappaya");

        System.out.println("Element at index number two: " + str.get(2));
        for (String fruits : str) {
            System.out.println(fruits);
        }
        System.out.println(str);
        System.out.println("******************************");
        Iterator<String> itr = str.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
