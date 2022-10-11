import java.util.HashMap;
import java.util.Map;

/**
 * created     by benjiamin at 2022-08-21 / 10:04 /04
 */
public class MapTransDemo {

    public static void main(String[] args) {
        MapTransDemo  dd=new MapTransDemo();

        Map<String,Object>  class_map=new HashMap<>();
        dd.nam(class_map);

        System.out.println(class_map);
    }

    private  void nam(Map<String, Object> class_map) {

        class_map.put("o1","ben1");
        class_map.put("o2","ben2");
    }

}
