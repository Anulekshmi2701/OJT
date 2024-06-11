import java.util.HashMap;
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1, "Apple");
        m.put(2, "Orange");
        m.put(3, "Mango");
        m.put(4, "grapes");
    System.out.println("Value at key number one: "+m.get(1));
    m.replace(4, "grapes","Watermelon");
        for(Integer key:m.keySet()){
            System.out.println("key :"+key+",value: "+m.get(key));

        }
       
    }
    
}
