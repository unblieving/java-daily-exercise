import java.util.Random;
import java.util.Scanner;
/*public class Test4 {
    public static void main(String[] args){
        Random r=new Random();
        int number=r.nextInt(100)+1;
        System.out.println(number);

    }
}*/
public class Test4{
    public static void main(String[] args){
        Random r=new Random();
        int number=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("please input your number");
        int guess=sc.nextInt();
        while(guess!=number){
            if(guess>number){
                System.out.println("your number is too big");
                count++;
            }else{
                System.out.println("your number is too small");
                count++;
            }
            guess=sc.nextInt();
        }
        count++;
        System.out.println("Congratulations! You guessed the number.");
        System.out.println("You made " + count + " guesses.");

    }
}
