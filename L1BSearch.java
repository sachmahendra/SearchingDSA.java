public class L1BSearch {
    static int bSearch(int arr[], int x, int n){
       // int n= arr.length;
        int low=0 , high = n-1;
        while(low<high){
        int mid = (low + high)/2;
        if(arr[mid]==x){
        return mid;
        }
        else if(arr[mid]>x){
            high= mid-1;
        }
        else
        low= mid + 1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x= 4;
        int n=5;
        System.out.println(bSearch(arr, x,n));
    }
}
