package OptionalDemo;

//import com.alibaba.fastjson.JSONObject;
//import com.sun.org.apache.xpath.internal.objects.XObject;
//import org.junit.jupiter.api.condition.DisabledOnJre;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * created     by benjiamin at 2022/7/14 / 16:45 /45
 */
public class Test {


    public void name(RuntimeException e, Map<String, Object> map) throws Exception {
//        如果Optional实例有值则将其返回，否则返回orElse方法传入的参数
//            e.getStackTrace()  返回的类型就是     StackTraceElement[]
        StackTraceElement[] jsb = Optional.ofNullable(e.getStackTrace()).orElseThrow(() -> new RuntimeException("nihsi"));

//            String  cls=Optional.ofNullable().orElse("");

    }

    public void namedd(Map<String, Object> map) {
        Map<String, Object> localMap = Optional.ofNullable((Map<String, Object>) map.get("ggg")).orElse(new HashMap<>());
    }
}
