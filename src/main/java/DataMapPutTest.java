import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMapPutTest {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();
        dataList.add("111");
        dataList.add("222");
        dataList.add("333");
        String[] keyArr = new String[]{"aaa", "bbb", "ccc"};


        Map<String, TemplateParam> data = new HashMap<>();
        for (int index = 0; index < dataList.size(); ++index) {
            TemplateParam templateParam = new TemplateParam();
            templateParam.setValue(dataList.get(index));
            templateParam.setColor("#173177");
            data.put(keyArr[index], templateParam);
        }
        System.out.println(data);
    }


}

class TemplateParam {

    /**
     * 值
     */
    private String value;
    /**
     * 颜色
     */
    private String color;

    public TemplateParam() {}

    public TemplateParam(String value) {
        this.value = value;
    }

    public TemplateParam(String value, String color) {
        super();
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{value: " + value + ", color: " + color + "}";
    }
}