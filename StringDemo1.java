public class StringDemo1 {
    public static void main(String[] args){
        String str1="abc";
        System.out.println(str1);

        String str2=new String();
        System.out.println("@"+str2+"@");//""

        String str3=new String("abc");
        System.out.println(str3);

        char[] ch={'a','b','c'};
        String str4=new String(ch);
        System.out.println(str4);

        byte[] b={97,98,99};
        String str5=new String(b);
        System.out.println(str5);

        
    }
}
