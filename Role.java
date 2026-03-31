import java.util.Random;
public class Role {
    private String name;
    int blood;
    public Role(){

    }
    public Role(String name,int blood){
        this.name=name;
        this.blood=blood;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setBlood(int blood){
        this.blood=blood;
    }
    public String getName(){
        return name;
    }
    public int getBlood(){
        return blood;
    }
    public void attack(Role role){
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        int remain=role.getBlood()-hurt;
        if (remain<0){
            remain=0;
        }
        role.setBlood(remain);
        System.out.println(this.name+"伤害了"+role.name+"，造成了"+hurt+"点伤害，"+role.name+"剩余血量为"+remain);
    }    



}
