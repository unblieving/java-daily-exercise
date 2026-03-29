import java.util.Random;
public class Test9 {
    public static void main(String[] args){
        char[] arr=new char [52];
        for(int i=0;i<52;i++){
            if(i<26){
                arr[i]=(char)(97+i);
            }
            else{
                arr[i]=(char)(65+i-26);
            }
        }
        Random r=new Random();
        String res="";
        for(int i=0;i<4;i++){
            int number=r.nextInt(arr.length);
            res+=arr[number];
        }
        res+=r.nextInt(10);
        System.out.println(res);

    }
}
