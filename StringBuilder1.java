import java.util.Scanner;
public class StringBuilder1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();
        
        String str3=new StringBuilder().append(str1).reverse().toString();
        if(str1.equals(str3)){
            System.out.println("是回文字符串");
        } else {
            System.out.println("不是回文字符串");
        }  
    }
}
