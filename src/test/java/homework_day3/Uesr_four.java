package homework_day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuhaoyuhao on 2019/6/18.
 */
public class Uesr_four {
    public static List<Object> User() {
        List<String> literature = new ArrayList<String>();
        literature.add("哈利珀特");
        literature.add("金瓶梅");

        Map<String, Object> hobby = new HashMap<String, Object>();
        hobby.put("文学", literature);
        List<Object> User_four = new ArrayList<Object>();
        User_four.add("0004");
        User_four.add("Chaucelly");
        User_four.add(30);
        User_four.add(hobby);
        return User_four;

    }
}