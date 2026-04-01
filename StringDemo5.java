public class StringDemo5 {
    public static void main(String[] args){
        String s="你玩的真好，以后不要再玩了，TMD,CNM";
        String[] str={"TMD","CNM","MLGB","SB","NMSL"};
        for(int i=0;i<str.length;i++){
            s=s.replace(str[i],"***");
        }
        System.out.println(s);
    }
}
