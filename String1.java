public class String1 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");

        System.out.println(sb);
        
        sb.reverse();
        
        System.out.println(sb);

        int length=sb.length();

        System.out.println(length);

        String s=sb.toString();
        System.out.println(s);
    }
}
