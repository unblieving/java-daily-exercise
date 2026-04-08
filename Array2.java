import java.util.*;
public class Array2 {
    public static void main(String[] args){
        ArrayList<Car> list=new ArrayList<>();
        list.add(new Car("宝马","黑色",1000000));
        list.add(new Car("奔驰","白色",800000));
        list.add(new Car(" Audi","蓝色",600000));
        for(int i=0;i<3;i++){
            Car car=new Car();
            System.out.println("请输入第"+(i+1)+"辆车的品牌、颜色和价格");
            Scanner sc=new Scanner(System.in);
            String brand=sc.next();
            String color=sc.next();
            int price=sc.nextInt();
            car.setBrand(brand);
            car.setColor(color);
            car.setPrice(price);
            list.add(car);
        }
        for(int i=0;i<list.size();i++){
            Car car=list.get(i);
            System.out.println(car.getBrand()+"-"+car.getColor()+"-"+car.getPrice());
        }
        for(Car car:list){
            System.out.println(car.getBrand()+"-"+car.getColor()+"-"+car.getPrice());

        }
    }
}
