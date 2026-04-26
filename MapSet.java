import java.util.*;
public class MapSet {
    public static void main(String[] args){
        HashMap<String,String> hm=new HashMap<>();
        hm.put("name","张三");
        hm.put("age","18");
        hm.get("name");
        hm.get("age");
        hm.getOrDefault("name","未知");
        hm.containsKey("name");
        hm.containsValue("18");
        hm.remove("name");
        hm.size();
        for(String key:hm.keySet()){
            System.out.println(key+":"+hm.get(key));
        }
        for(String value:hm.values()){
            System.out.println(value);

        }
        for(Map.Entry<String,String> e:hm.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }



        HashSet<String> hs=new HashSet<>();
        hs.add("apple");
        hs.add("pear");
        hs.contains("apple");
        hs.remove("apple");
        hs.size();
        }
}
