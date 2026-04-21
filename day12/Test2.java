package day12;
import java.util.*;

public class Test2 {
    public static void main(String[] args){
        HashMap<String,Integer> map =new HashMap<>();
        //HashMap中的方法主要还是以使用Key为主，除了内个containsValue()方法
        map.put("alice",18);
        map.put("bob",19);
        System.out.println(map);
        map.put("alice",20);
        System.out.println(map);
        map.get("alice");
        map.getOrDefault("bob",18);
        map.containsKey("alice");
        map.containsValue(18);
        map.remove("bob");
        map.size();//得到的是总的键值对数
        //HashMap中的遍历
        for(String key:map.keySet()){
            System.out.println(key+":"+map.get(key));//其实等于是两次查找，效率没有第三种方法高
        }
        for(Integer value:map.values()){
            System.out.println(value);
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey+":"+e.getValue());
        }
    }
}
