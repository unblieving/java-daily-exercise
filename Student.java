public class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }
    @Override
    public void show(){
        System.out.println("学生姓名："+getName()+"，年龄："+getAge());
    }
}
