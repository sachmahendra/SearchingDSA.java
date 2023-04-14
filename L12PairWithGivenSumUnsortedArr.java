import java.util.HashSet;

//by hashing technique

public class L12PairWithGivenSumUnsortedArr {
    static void printPair(int arr[], int n, int sum){
        HashSet<Integer> s= new HashSet<Integer>();
        for(int i= 0; i<n;i++){
            int temp = sum- arr[i];

            if(s.contains(temp)){
            System.out.println("pair with given sum "+ sum +" is ("+ arr[i] + " , " + temp +" )" );
        }
        s.add(arr[i]);
    }
    
    }

    public static void main(String[] args) {
        int arr[]= {8,11,3,2,30,14};
        int n= 6;
        int sum = 17;
        printPair(arr, n, sum);
        
    }
}
