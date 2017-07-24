import com.alibaba.fastjson.JSONObject;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chentao on 21/06/2017.
 */
public class ParseJsonTest {
    public static void main(String[] args) {
//        System.out.println(getObject().toString());
//        System.out.println(getObject1().toString());


        String result = "{\"resp\":{\"respCode\":\"000000\",\"templateSMS\":{\"createDate\":\"20170718143311\",\"smsId\":\"dc8338a46c3478ca0df5c991fcc3aaee\"}}}";
        Map<String, Object> jsonMap = JSONObject.parseObject(result, Map.class);
        Map<String, Object>  resp = (Map<String, Object>) jsonMap.get("resp");
        String respCode = (String) resp.get("respCode");
        System.out.println(respCode);

        Map<String, Object> templateSMS = (Map<String, Object>) resp.get("templateSMS");
        String calendar = (String) templateSMS.get("createDate");
        String smsId = (String) templateSMS.get("smsId");
        System.out.println(calendar);
        System.out.println(smsId);
    }

    private static Object getObject() {
        Map<String, String> param = new HashMap<String, String>();
        param.put("name", "nick name");
        param.put("number", "1234567");
        param.put("account", "15920312345");

        return JSONObject.toJSON(param);
    }

    private static Object getObject1() {
        Map<String, String> param = new HashMap<String, String>();
        param.put("name", "nick name");
        param.put("number", "1234567");
        param.put("account", "15920312345");

        return JSONObject.toJSON(param);
    }
}
