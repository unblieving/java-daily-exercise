public class StringB {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        sb.append("Hello, World!");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int length=sb.length();
        System.out.println(length);
        String s=sb.toString();
        System.out.println(s);
        
    }
}
