package JSONdemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * created at 2021/9/15 16:37  littleCollection
 */

public class JsonDemo {

    public static void main(String[] args) {
        JsonDemo  jsond=new JsonDemo();
        String  str=  "{\"a\":\"345\"}";

        jsond.jsond(str);
    }

    public  void  jsond(String str) {
        JSONObject obj=(JSONObject)JSON.parse(str);

        System.out.println(obj);
    }

}
