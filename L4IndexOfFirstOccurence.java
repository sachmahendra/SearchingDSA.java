// naive solution 

// time comp  O(n)  , aux space O(1)
/* 

public class L4IndexOfFirstOccurence {
    static int firstOcurence(int arr[], int n, int x){
        for(int i=0; i<n;i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5,3};
        int n=6;
        int x=3;
        System.out.println("first occurence of x at index : "+firstOcurence(arr, n, x));
    }
}

*/

// RECURSIVE SOLUTION
// TIME C = O(N)

public class L4IndexOfFirstOccurence {
    static int firstOcurence(int arr[], int x, int low ,int high){
        if(low>high) return -1;
       int  mid = (low +high)/2;
       if(arr[mid]>x){
        firstOcurence(arr, x, low, high =mid-1);
       }
       else if(arr[mid]<x){
        firstOcurence(arr, x, low =mid+1, high);
       }

       else{
        if(mid ==0 || arr[mid-1]!=arr[mid]) //CHECK KRNE KE LIYE KI KNHI MID ELEMENT SE PHLE BHI X HAI YA NHI
        return mid;
        else
        return firstOcurence(arr, x, low, mid -1);
       }
       return mid-1;

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,20,3};
        int low=0 , high = 5;
        int x=3;
        System.out.println("first occurence of x at index : "+firstOcurence(arr, x,low,high));
    }
}