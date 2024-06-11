import java.util.*;
import java.util.stream.Collectors;


public class streamex {
    public static void main(String[] args){
        //filtering

        List<String> names=Arrays.asList("Summer","Monsoon","Autum","Spring","Winter");

        List<String> fnames=names.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());
        System.out.println("filterd names are:"+fnames);

        //Sorting
        List<String> snames=names.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted names are:"+snames);

        //mapping
        Map<Integer,List<String>> mobj=names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("filterd names are:"+fnames);
        
    }
}
