//随机中奖
/*import java.util.Random;
public class Test10 {
    public static void main(String[] args){
        int[] arr={2,588,888,1000,10000};
        int[] buffer=new int[arr.length];
        Random r=new Random();
        int index=0;
        while(index<=arr.length-1){
            int ind=r.nextInt(5);
            boolean flag=true;
            for(int i=0;i<index;i++){
                if(buffer[i]==arr[ind]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                buffer[index]=arr[ind];
                index++;
            }
        }
        for(int i:buffer){
            System.out.print(i+" ");
        }
    }
}*/
import java.util.Random;
public class Test10{
    public static void main(String[] args){
        int[] arr={2,588,888,1000,10000};
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int index=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
