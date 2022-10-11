import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created at 2021/9/15 16:37  littleCollection
 */
public class T {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();


        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();
        Map<String, String> map4 = new HashMap<String, String>();

        String name4 = "zs";
        map4.put("cpmc", name4);

        String name1 = "";
        map1.put("cpmc", name1);
        String name2 = "";
        map2.put("cpmc", name2);
        String name3 = "";
        map3.put("cpmc", name3);

        list.add(map4);

        list.add(map1);
        list.add(map2);
        list.add(map3);


        List<String> names = new ArrayList<String>();
        Map<String, Integer> numMap = new HashMap<>();

        for (Map<String, String> mapvo : list) {
            String namex = mapvo.get("cpmc");
            if (!"".equals(namex) && !names.contains(namex)) {
                names.add(namex);
                numMap.put(namex, 1);

            } else {

                int num =   numMap.get(namex);
                numMap.put(namex, ++num);
            }

        }


        System.out.println(numMap.toString());


    }


}
