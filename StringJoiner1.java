import java.util.StringJoiner;
public class StringJoiner1 {
        public static void main(String[] args){
        StringJoiner sj=new StringJoiner(", ", "[", "]");
        sj.add("Java").add("Python").add("C++");
        int len=sj.length();
        String str=sj.toString();
        System.out.println(sj);
        System.out.println(len);
        System.out.println(str);

    }
}
