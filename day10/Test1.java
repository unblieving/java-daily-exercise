package day10;
//多态综合练习
public class Test1{
    public static void main(String[] args){
        Person1 person = new Person1("张三", 25);
        Cat1 cat = new Cat1("橘色", 3);
        person.keepPet(cat, "小鱼干");
        Dog1 dog = new Dog1("黑色", 5);
        person.keepPet(dog, "骨头");
    }
}