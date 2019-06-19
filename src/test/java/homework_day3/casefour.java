package homework_day3;

import java.util.*;

import static javafx.scene.input.KeyCode.M;

/**
 * Created by yuhaoyuhao on 2019/6/18.
 */
public class casefour {
    public static void main(String[] args) {

        Map<String, Object> stu = new HashMap<String, Object>();
        stu.put("0001", User_one.User());
        stu.put("0002", User_two.User());
        stu.put("0003", User_three.User());
        stu.put("0004",Uesr_four.User());
        List<Object> literature =new ArrayList<Object>();
        List<Object> film =new ArrayList<Object>();

        for (Map.Entry<String, Object> entry : stu.entrySet()) {
            List<Object> lisMap = (List<Object>) entry.getValue();
            Map<Object,Object> mp=(Map<Object,Object>)lisMap.get(3);
            if (mp.containsKey("文学")){
                literature.add(entry.getValue());
            }else {
                film.add(entry.getValue());
            }


        }
        System.out.println("文学小组人员"+literature);
        System.out.println("电影小组人员"+film);


    }
}

