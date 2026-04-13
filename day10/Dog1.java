package day10;

public class Dog1 extends Animal1 {
    public Dog1(){};
    public Dog1(String color,int age){
        super(color,age);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死地抱住"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
