import java.util.ArrayList;
public class Array1{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C语言");
        System.out.println(list);
        list.remove("Java");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list);
        //res返回被替换的元素
        String res=list.set(0, "C++");
        System.out.println(res);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}