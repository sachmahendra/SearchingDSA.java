import java.util.Arrays;

public class SortArray {
    static int[] sortArr(int arr[], int n){
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,45,7};
        int n= 5;
        System.out.println("Before sorting");
        for(int i= 0; i<n;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println();
        sortArr(arr, n);

        System.out.println("after sorting");
        for(int  i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
