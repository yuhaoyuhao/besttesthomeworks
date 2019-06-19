package homework_day3;

import java.util.HashMap;


import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static homework_day3.User_one.User;

/**
 * 定义一个map,key是userid,value是user,要求遍历整个数据并打印
 * Created by yuhaoyuhao on 2019/6/17.
 */
public class casetwo {
    public static void main(String[] args) {
        Map<String,Object> stu=new HashMap<String, Object>();
        stu.put("0001", homework_day3.User_one.User());
        stu.put("0002", homework_day3.User_two.User());
        stu.put("0003", homework_day3.User_three.User());
        stu.put("0004", homework_day3.Uesr_four.User());

        for (Map.Entry<String,Object> entry:stu.entrySet()){
            System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
        }
    }

}
