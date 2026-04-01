import java.util.Scanner;
public class CarTest {
    public static void main(String[] args){
        Car cars[] =new Car[3];
        /*cars[0]=new Car("保时捷","蓝色",1000000);
        cars[1]=new Car("法拉利","红色",5000000);
        cars[2]=new Car("兰博基尼","紫色",20000000);
*/
        for(int i=0;i<cars.length;i++){
            cars[i]=new Car();
            System.out.println("请输入第"+(i+1)+"辆车的品牌");
            Scanner sc=new Scanner(System.in);
            String brand=sc.next();
            cars[i].setBrand(brand);
            System.out.println("请输入第"+(i+1)+"辆车的颜色");
            String color=sc.next();
            cars[i].setColor(color);
            System.out.println("请输入第"+(i+1)+"辆车的价格");
            int price=sc.nextInt();
            cars[i].setPrice(price);
            System.out.println("第"+(i+1)+"辆车的信息为："+"品牌："+cars[i].getBrand()+"颜色："+cars[i].getColor()+"价格："+cars[i].getPrice());
        }
    }
}