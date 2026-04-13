package day10;

public class Person1 {
    private String name;
    private int age;
    public Person1(){};
    public Person1(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void keepPet(Animal1 pet,String something){
        System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+pet.getColor()+"的"+pet.getAge()+"岁的宠物");
        pet.eat(something);
    }

}
