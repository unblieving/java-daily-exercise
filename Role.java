import java.util.Random;
public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces={"风流俊雅","英俊潇洒","相貌平平"};
    String[] girlfaces={"美美哒","大长腿","小蛮腰"};

    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    public void setFace(char gender){
        if(gender=='男'){
            Random r=new Random();
            int index=r.nextInt(boyfaces.length);
            this.face=boyfaces[index];
        }
        else if(gender=='女'){
            Random r=new Random();
            int index=r.nextInt(girlfaces.length);
            this.face=girlfaces[index];
        }
        else{
            this.face="面目狰狞";
        }
    }
    public String getFace(){
        return face;
    }
        
    public Role(){

    }
    public Role(String name,int blood,char gender){
        this.name=name;
        this.blood=blood;
        this.gender=gender;
        setFace(gender);
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
    public void showRoleInfo(){
        System.out.println("角色信息：");
        System.out.println("姓名："+name);
        System.out.println("性别："+gender);
        System.out.println("外貌："+face);        
    } 



}
