class Phone{
    String brand;
    double price;
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
}
public class PhoneTest {
    public static void main(String[] args){
        Phone p=new Phone();
        p.brand="vivo";
        p.price=1999.99;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
    }
}
