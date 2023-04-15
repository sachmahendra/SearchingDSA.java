public class L14Mejority2 {
    static int majorEle(int arr[], int n){
        int count =1;
        for(int i=1; i<n;i++){
            if(arr[i]==arr[i-1])
            count++;
            if(count++ > n/2)
            return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {6,8,4,8,8};
        int n = 5;
        System.out.println(majorEle(arr, n));
    }
}
