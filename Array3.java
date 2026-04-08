import java.util.*;
public class Array3 {
    public static void main(String[] args){
        ArrayList<Car> list=new ArrayList<>();
        list.add(new Car("宝马","黑色",1000000));
        list.add(new Car("奔驰","白色",800000));
        list.add(new Car(" Audi","蓝色",600000));
        for(Car car:list){
            System.out.println(car.getBrand()+"-"+car.getColor()+"-"+car.getPrice());
        }
        System.out.println();
        ArrayList<Car> res=getCar(list);
        for(Car car:res){
            System.out.println(car.getBrand()+"-"+car.getColor()+"-"+car.getPrice());
        }
    }
    //返回多个结果放到一个容器里
    public static ArrayList<Car> getCar(ArrayList<Car> list){
        ArrayList<Car> result=new ArrayList<>();
        for(Car car:list){
            if(car.getPrice()>700000){
                result.add(car);
            }
        }
        return result;
    }
}

