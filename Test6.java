//数组求和、平均值
/*import java.util.Random;
public class Test6 {
    public static void main(String[] args){
        int[] a=new int [10];
        Random r=new Random();
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
            sum+=a[i];
        }
        System.out.println("sum:"+sum);
        System.out.println("average:"+(double)sum/a.length);
        System.out.printf("average:%.2g%n", (double)sum/a.length);
    }
}*/
//数组反转
import java.util.Random;

/*public class Test6{
    public static void main(String[] args){
        int[] a=new int [10];
        Random r=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(100)+1;
            
        }
        for(int i:a){
            System.out.println(i);
        }
        for (int i=0,j=a.length-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}*/
//打乱数据
/*import java.util.Random;
public class Test6{
    public static void main(String[] args){
        int [] a={1,2,3,4,5};
        Random r=new Random();
        for(int i=0;i<a.length;i++){
            int index=r.nextInt(5);
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        for(int i:a){
            System.out.println(i);      
        }
    }
}*/
//两个数组指向同一个地址
public class Test6{
    public static void main(String[] args){
        int [] a={1,2,3,4,5};
        int [] b=a;
        b[0]=100;
        System.out.println(a[0]);
    }
}
