// RECURSIVE SOLUTION 
// TIME AND AUX SPACE COMPL IS  O(LOG N)

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class L5IndexOfLastOcurrence {
    static int lastOcc(int arr[], int x, int low, int high){
        int n= arr.length;
        if(low>high) return -1;
        int mid = (low + high)/2;
        if(arr[mid]>x)
        return lastOcc(arr, x, low, high = mid-1);
        else if(arr[mid]< x)
        return lastOcc(arr, x, low = mid+1, high);

        else{
            if(mid== n-1 || arr[mid] != arr[mid+1])
            return mid;

            else
            return lastOcc(arr, x, low = mid+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,10,10,10,10,20,20};
        int n= 7;
        int low=0;
        int high= n-1;
        int x= 20;
        System.out.println(lastOcc(arr, x, low, high));
    }
}
