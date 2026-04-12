public class TestDemo {
    public static void main(String[] args){
        //测试工具类中两个方法
        int[] arr={1,2,3,4,5};
        System.out.println(Arrayutil.printArr(arr));
        
        double[] arr2={1.2,2.4,3.3};
        System.out.println(Arrayutil.getAverage(arr2));
    } 
}
