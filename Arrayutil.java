public class Arrayutil{
    private Arrayutil(){

    }
    //定义为静态，方便调用
    public static String printArr(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
            

        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAverage(double[] arr){
        double sum=0;
        for(double i:arr){
            sum+=i;
        }
        return sum/arr.length;
    }
}