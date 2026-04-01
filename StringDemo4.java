import java.util.Scanner;
public class StringDemo4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        int bigcount=0;
        int smallcount=0;
        int numcount=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a'&&c<='z'){
                smallcount++;
            } else if(c>='A'&&c<='Z'){
                bigcount++;
            } else if(c>='0'&&c<='9'){
                numcount++;
            }
        }
        System.out.println("大写字母的个数是："+bigcount);
        System.out.println("小写字母的个数是："+smallcount);
        System.out.println("数字的个数是："+numcount);
        
    }
}
