package homework_day3;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * 接受一个键盘输入的字符串,输入这个字符串中所有元素的的数量都是多少
 * Created by yuhaoyuhao on 2019/6/17.
 */
public class StringCount {
    public static void Stcount(){
        Scanner scanner=new Scanner(System.in);
        String st=scanner.next();
        //System.out.println(st);
        char[] chars=st.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        for (char c:chars){
            Integer count =hashMap.get(c);
            if (count==null){
                hashMap.put(c,1);
            }else {
                hashMap.put(c,++count);
            }

        }
        for (Map.Entry<Character,Integer> mp:hashMap.entrySet()){
            System.out.print(mp.getKey()+"("+mp.getValue()+")");
        }

    }

    public static void main(String[] args) {
        Stcount();
    }
}
