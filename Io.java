import java.io.*;
import java.util.*;
public class Io{
    public static void main(String[] args){
        try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))){
            String line;
            while((line=br.readLine())!=null){
                process(line);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }


        try(BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt",true))){
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("Hello, World!");
        }
        catch(IOException e){
            e.printStackTrace();
        }



        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String line=sc.nextLine();
        int a=sc.nextInt();
        double b=sc.nextDouble();
        String s=sc.next();
    }
}