public class L6CountOcurrenceInSortedArray {
    static int firstOcc(int arr[], int x){
        int n= arr.length;
         int low =0;
       int  high = n-1;
        while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid] > x)
        high = mid-1;

        else if(arr[mid]<x)
        low = mid+1;

        else{
            if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;
            else
            high = mid-1;
        }
        
        }
        return -1;
    }

    static int lastOcc(int arr[], int x){
        int n= arr.length;
       int low =0;
       int  high = n-1;
       while(low<=high){
       int mid = (low+high)/2;
       if(arr[mid] > x)
       high = mid-1;

       else if(arr[mid]<x)
       low = mid+1;

       else{
           if(mid == n-1 || arr[mid + 1] != arr[mid])
                   return mid;
           else
           low = mid+1;
       }
       
       }
       return -1;
   }

   static int countOcc(int arr[], int x)
	{
		int first = firstOcc(arr, x);

		if(first == -1)
			return 0;
		else 
			return lastOcc(arr,  x) - first + 1;
	}


    public static void main(String[] args) {
        int arr[]={10,20,20,20,40,40}; 
      // int arr[]={0,0,0,0,1,1,1,1};
         int x=20;
        int n=6;
        System.out.println(countOcc(arr, x));
    }
}
