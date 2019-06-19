package homework_day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuhaoyuhao on 2019/6/18.
 */
public class User_two {
    public static List<Object> User(){
        List<Object> film = new ArrayList<Object>();

        film.add("杀死比尔1");
        film.add("杀死比尔2");
        film.add("大白鲨");
        Map<String,Object> hobby =new HashMap<String, Object>();
        hobby.put("电影",film);
        List<Object> User_two=new ArrayList<Object>();
        User_two.add("0002");
        User_two.add("kate");
        User_two.add(27);
        User_two.add(hobby);
        return User_two;

    }
}
