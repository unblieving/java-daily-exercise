public class Teacher extends Person {
    public Teacher(String name,int age){
        super(name,age);
    }
    @Override
    public void show(){
        System.out.println("教师姓名："+getName()+"，年龄："+getAge());
    }
}
