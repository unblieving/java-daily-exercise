public class Str2 {
    public static void main(String[] args){
        int n=10;
        String s1=String.valueOf(n);
        int i=Integer.parseInt(s1);
        double d=Double.parseDouble(s1);
        long l=Long.parseLong(s1);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int a=0;
        int b=1;
        int c=a>b?a:b;
        //这里s可以直接用
        if(s1 instanceof String s){
            System.out.println(s);
        }
        String s2="""
                hello, world!
                你好，世界！
                """;
        s2.isBlank();
        s2.isEmpty();
        s2.strip();
        s2.stripLeading();
        s2.stripTrailing();
        s2.repeat(3);
        String[] n=s2.split(" ");


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    }
    
}
