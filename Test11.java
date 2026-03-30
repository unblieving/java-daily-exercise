public class Test11 {
    public static void main(String[] args){
        int[][] yearArrArr={
            {11,22,33,44},
            {55,66,77,88},
            {99,11,22,33},
            {44,55,66,77}
        };
        int totalSum=0;
        for(int i=0;i<4;i++){
            int sum=getSum(yearArrArr[i]);
            System.out.println("第"+(i+1)+"季度总和:"+sum);
            totalSum+=sum;
        }
        System.out.println("总总和:"+totalSum);
    }
    public static int getSum(int[] arr){
        int sum=0;
        for(int i:arr ){
            sum+=i;
        }
        return sum;
    }
}
