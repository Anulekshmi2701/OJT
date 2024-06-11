import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
   public static void main(String[] args) {
       HashSet<String> str = new HashSet<>();
       str.add("CSS");
       str.add("HTML");
       str.add("JAVA");
       str.add("Js");
       Iterator<String> itr = str.iterator();
       while(itr.hasNext()) {
           System.out.println(itr.next());
       }
       str.remove("JAVA");
       System.out.println(str);
   }
}
