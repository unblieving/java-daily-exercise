package day10;

public class Cat1 extends Animal1 {
    public Cat1(){};
    public Cat1(String color,int age){
        super(color,age);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
