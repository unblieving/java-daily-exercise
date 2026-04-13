package day10;

public class Animal1 {
    private String color;
    private int age;
    public Animal1(){};
    public Animal1(String color,int age){
        this.color=color;
        this.age=age;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void eat(String something){
        System.out.println("动物在吃"+something);
    }
}
