class Person{
    public void lunch(){
        eat();
        drink();

    }
    public void eat(){
        System.out.println("吃米饭");

    }
    public void drink(){
        System.out.println("喝温水");
    }
}
public class OverseasStudent extends Person {
    public static void main(String[] args){
        OverseasStudent os=new OverseasStudent();
        os.lunch();
        
    }
    public void lunch(){
        super.lunch();
        eat();
        drink();
    }
    @Override
    public void eat(){
        System.out.println("吃面包");
    }
    @Override
    public void drink(){
        System.out.println("喝咖啡");
    }
    
}
