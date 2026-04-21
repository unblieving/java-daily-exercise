package day12;
import java.io.*;
import java.nio.file.*;
public class Test1 {
    public static void main(String[] args){
        //文件读取
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        try(BufferedReader br2=new BufferedReader(new FileReader("data.txt"))){
            String line2;
            while((line2=br2.readLine())!=null){
                System.out.println(line2);

            }

        }
        catch(IOException e){
            e.printStackTrace();

        }
        //文件读取另一种方式——需要索引
        List<String> list=Files.readAllLines(Paths.get("data.txt"));//用的类中的静态方法
        for(String line:list){
            System.out.println(line);
        }
        //文件写入
        //这是一种TRY_WITH_RESOURCES的写法，可以不用close
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt",true))){
            bw.write("Hello");
            bw.newLine();
            bw.write("World");
        }
        catch(IOException e){
            e.printStackTrace();

        }
        //加上true就是追加导入，这里无需包含FileWriter，因为PrintWriter已经包含FileWriter
        try(PrintWriter pw=new PrintWriter("out.txt",true)){
            pw.println("Hello");
            pw.printf("%d+%d=%d%n",1,2,3);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

        }
        //还有一种控制台交互
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String line=sc.nextLine();
        System.out.println(line);

    }
}
