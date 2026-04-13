public class Administrator extends Person{
    public Administrator(String name,int age){
        super(name,age);
    }
    @Override
    public void show(){
        System.out.println("管理员："+getName()+"，年龄："+getAge());
    }
    
}
