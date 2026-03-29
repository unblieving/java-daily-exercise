public class Test8 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] arr2=copyOfRange(arr,1,3);
        for(int i:arr2){
            System.out.print(i+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr=new int[to-from];
        for(int i=0;i<newArr.length;i++){
            newArr[i]=arr[from+i];
        }
        return newArr;
    }
}
