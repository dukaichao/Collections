package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-11
 * Time:17:03
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = 0;i<5;i++){
            mp.put(i+1,count++);
        }
        System.out.println("获取所有键："+mp.keySet());
        System.out.println("获取所有值："+mp.values());
        System.out.println("=========================");
        //mp遍历
        //第一种和第二种需导包java.util.Map.Entry;
        System.out.println("第一种遍历方式：");
        for(Entry<Integer,Integer> e : mp.entrySet()){
            System.out.println("键："+e.getKey()+" ,值："+e.getValue());
        }
        System.out.println("=========================");
        System.out.println("第二种遍历方式：");
        for(Integer tmp : mp.values()){
            System.out.println(tmp);
        }
        System.out.println("=========================");
        System.out.println("第三种遍历方式：");
        for(Integer tmp : mp.keySet()){
            System.out.println("键："+tmp+" ,值："+mp.get(tmp));
        }

    }
}
