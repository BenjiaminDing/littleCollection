import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created at 2021/9/15 16:37  mapentry
 */
public class Mapentry {


    public static void main(String[] args) {
        Map<Character,Integer>  map=new HashMap<>();

        List<Map.Entry<Character,Integer>>  lsit=new ArrayList<>();
        List<Map.Entry<Character,Integer>>  lst=new ArrayList<>(map.entrySet());
        System.out.println(lsit);
        System.out.println(lst.getClass());
    }
}
