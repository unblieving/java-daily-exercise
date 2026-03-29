public class Test7 {
    public static void main(String[] args){
        System.out.println(isSame(1,1));
        System.out.println(isSame(1L,1L));
        System.out.println(isSame(10,10));
        System.out.println(isSame(100000000,100000000));
    }
    public static boolean isSame(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("long");
        return a==b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
}
