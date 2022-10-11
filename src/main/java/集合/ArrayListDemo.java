package 集合;

import java.util.*;

/**
 * created at 2021/9/15 16:37  littleCollection
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<Map<String,String>> maplist=new ArrayList<Map<String,String>>();
        Map<String,String>  map1=new HashMap<String,String>(5);
        map1.put("1","1");
        map1.put("2","2");
        Map<String,String>  map2=new HashMap<String,String>(5);
        map2.put("1","1");
        map2.put("2","2");
        maplist.add(map1);
        maplist.add(map2);


        LinkedHashSet<Map<String,String>> hashSet = new LinkedHashSet<>(maplist);
        ArrayList<Map<String,String>> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println(listWithoutDuplicates);
    }
}
