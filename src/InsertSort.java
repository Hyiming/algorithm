import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,2,8,5,9,1,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            //如果当前数字比前一个数字小
            if(arr[i]<arr[i-1]){
                //把当前遍历数字存起来
                int temp=arr[i];
                //遍历当前数字前所有的数字
                int j;
                for (j=i-1;j>=0&&temp<arr[j];j--) {
                    //把前一个数字赋给后一个数字
                    arr[j+1]=arr[j];
                }
                //把临时变量（外层for循环的当前元素）赋给不满足条件的后一个元素
                    arr[j+1]=temp;
            }
        }
    }
}
