public class TestDemo1 {
    public static void main(String[] args){
        Ragdoll r=new Ragdoll();
        r.eat();
        r.catchMouse();
        r.drink();
        System.out.println("---------");
        Husky h=new Husky();
        h.eat();
        h.breakHome();
        h.drink();
        
    }
}
