public class Birth {
    public static void main(String[] args){
        String id="321378202601310090";
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println("出生日期是："+year+"年"+month+"月"+day+"日");
        char gender=id.charAt(17);
        int num=gender-48;
        if(num%2==0){
            System.out.println("性别是：女");
        } else {
            System.out.println("性别是：男");
        }
    }
}
