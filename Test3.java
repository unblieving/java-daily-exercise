import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        int choose=sc.nextInt();
        switch(choose){
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("周末");
                break;
            default:
                System.out.println("输入错误");
        }*/
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       switch(a){
        case 1,2,3,4,5->System.out.println("工作日");
        case 6,7->System.out.println("周末");
        default->System.out.println("输入错误");
       }
    }
}
