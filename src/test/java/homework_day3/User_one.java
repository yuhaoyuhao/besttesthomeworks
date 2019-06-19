package homework_day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuhaoyuhao on 2019/6/18.
 */
public class User_one {
    public static List<Object> User(){
        List<String> literature = new ArrayList<String>();
        //List<Object> film = new ArrayList<Object>();
        literature.add("三国演义");
        literature.add("水浒传");
        //film.add("黑衣人1");
        //film.add("黑衣人2");
        Map<String,Object> hobby =new HashMap<String, Object>();
        hobby.put("文学",literature);
        //hobby.put("电影",film);
        List<Object> User_one=new ArrayList<Object>();
        User_one.add("0001");
        User_one.add("Jim");
        User_one.add(10);
        User_one.add(hobby);
        return User_one;

    }

}
