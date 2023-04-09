public class L2BinarySearchRecursive {
    static int bSearch(int arr[], int x,int low,int high){
        if(low>high) return -1;
        int mid = (low + high )/2;
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]>x)
        bSearch(arr, x, low, high = mid-1);
        else
        bSearch(arr, x, low = mid+1, high);

        return mid;
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=3;
        int low=0;
        int n=5;
        int high = n-1;
        System.out.println("element x is found at index: "+bSearch(arr, x, low, high));
    }
}
