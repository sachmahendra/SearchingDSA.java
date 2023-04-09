public class L1LinerSearch1 {
    static void BinarySearch(int arr[], int x){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
            System.out.println("index is : "+i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=3;
        int n=5;
        BinarySearch(arr, x);
    }
}
