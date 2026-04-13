public class TestDemo2 {
    public static void main(String[] args){
        Student s=new Student("张三",20);
        Teacher t=new Teacher("李四",30);
        Administrator a=new Administrator("王五",40);

        register(s);
        register(t);
        register(a);
    }
    public static void register(Person p){
        p.show();
    }
}
