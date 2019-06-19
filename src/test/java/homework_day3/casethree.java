package homework_day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Created by yuhaoyuhao on 2019/6/18.
 */
public class casethree {
    public static void main(String[] args) {

        Map<String, Object> stu = new HashMap<String, Object>();
        stu.put("0001", User_one.User());
        stu.put("0002", User_two.User());
        stu.put("0003", User_three.User());
        stu.put("0004",Uesr_four.User());
        List<Object> oldlist =new ArrayList<Object>();
        List<Object> midlist =new ArrayList<Object>();
        List<Object> younglist =new ArrayList<Object>();



        for (Map.Entry<String, Object> entry : stu.entrySet()) {
            //System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
            List<Object> lisMap = (List<Object>) entry.getValue();
            //List<Object> list =new ArrayList<Object>();
            for (int i = 0; i < lisMap.size(); i++) {
                if (Integer.parseInt(String.valueOf(lisMap.get(2))) >= 30) {
                    oldlist.add(entry.getValue());
                    break;
                } else if (Integer.parseInt(String.valueOf(lisMap.get(2))) >= 20) {
                    midlist.add(entry.getValue());
                    break;
                } else {
                    younglist.add(entry.getValue());
                    break;
                }
            }
        }
        System.out.println("老年组:"+oldlist);
        System.out.println("中年组:"+midlist);
        System.out.println("少年组:"+younglist);

    }
}

