package homework_day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuhaoyuhao on 2019/6/18.
 */
public class User_three {
    public static List<Object> User() {
        List<Object> film = new ArrayList<Object>();
        film.add("速度与激情");
        film.add("魔戒");
        film.add("肖申克的救赎");
        Map<String, Object> hobby = new HashMap<String, Object>();
        hobby.put("电影", film);
        List<Object> User_three = new ArrayList<Object>();
        User_three.add("0003");
        User_three.add("Tim");
        User_three.add(40);
        User_three.add(hobby);
        return User_three;

    }
}
